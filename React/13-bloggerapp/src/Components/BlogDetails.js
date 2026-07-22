import React from "react";

export const blogs = [
  {
    id: 1,
    title: "React Learning",
    author: "Stephen Biz",
    content: "Welcome to learning React!"
  },
  {
    id: 2,
    title: "Installation",
    author: "Schwezdenier",
    content: "You can install React from npm."
  }
];

function BlogDetails(props) {
  return (
    <>
      {props.blogs.map(blog => (
        <div key={blog.id}>
          <h1>{blog.title}</h1>
          <h3>{blog.author}</h3>
          <p>{blog.content}</p>
        </div>
      ))}
    </>
  );
}

export default BlogDetails;