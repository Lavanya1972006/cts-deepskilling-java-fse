import React from "react";

export const courses = [
  { id: 1, cname: "Angular", date: "4/5/2021" },
  { id: 2, cname: "React", date: "6/3/2021" }
];

function CourseDetails(props) {
  return (
    <>
      {props.courses.map(course => (
        <div key={course.id}>
          <h1>{course.cname}</h1>
          <h3>{course.date}</h3>
        </div>
      ))}
    </>
  );
}

export default CourseDetails;