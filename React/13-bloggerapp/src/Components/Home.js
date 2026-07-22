import React from "react";
import BookDetails, { books } from "./BookDetails";
import BlogDetails, { blogs } from "./BlogDetails";
import CourseDetails, { courses } from "./CourseDetails";

function Home() {
  return (
    <div className="container">

      <div className="column">
        <h1>Course Details</h1>
        <CourseDetails courses={courses}/>
      </div>

      <div className="column">
        <h1>Book Details</h1>
        <BookDetails books={books}/>
      </div>

      <div className="column">
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs}/>
      </div>

    </div>
  );
}

export default Home;