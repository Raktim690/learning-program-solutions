import React from 'react';
import { blogs } from './data';

function BlogDetails() {
  const blogContent = (
    <ul>
      {blogs.map(blog => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="detail-panel">
      <h1>Blog Details</h1>
      {blogContent}
    </div>
  );
}

export default BlogDetails;