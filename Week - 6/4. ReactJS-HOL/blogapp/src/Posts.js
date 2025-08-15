import React from 'react';
import Post from './Post'; // Import the Post class

class Posts extends React.Component {
  constructor(props) {
    super(props);
    // Initialize the component with a list of Post in state [cite: 82]
    this.state = {
      posts: [],
      hasError: false,
      errorInfo: null,
    };
  }

  // Method to load posts using Fetch API [cite: 83]
  async loadPosts() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); // Use the provided URL [cite: 84]
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      // Assign fetched data to the component state [cite: 83]
      const fetchedPosts = data.map(item => new Post(item.id, item.title, item.body));
      this.setState({ posts: fetchedPosts });
    } catch (error) {
      console.error("Failed to fetch posts:", error);
      this.setState({ hasError: true, errorInfo: error });
    }
  }

  // componentDidMount hook to call loadPosts() when component mounts [cite: 86]
  componentDidMount() {
    this.loadPosts();
  }

  // componentDidCatch method to display errors [cite: 90]
  componentDidCatch(error, errorInfo) {
    this.setState({
      hasError: true,
      errorInfo: errorInfo,
    });
    // You can also log the error to an error reporting service
    console.error("Caught an error:", error, errorInfo);
    alert(`An error occurred: ${error.message}\nCheck console for details.`);
  }

  render() {
    // Display error message if an error occurred
    if (this.state.hasError) {
      return <h1>Something went wrong. Please try again later.</h1>;
    }

    // Display the title and body of posts [cite: 88]
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', borderRadius: '5px' }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;