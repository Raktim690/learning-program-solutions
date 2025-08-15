import React from 'react';
import './App.css';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div className="App">
      <header className="App-header-custom">
        <div className="content-container">
          {showCourses && <CourseDetails />}

          <div className="vertical-line"></div>

          {showBooks && <BookDetails />}

          <div className="vertical-line"></div>

          {showBlogs && <BlogDetails />}
        </div>
      </header>
    </div>
  );
}

export default App;