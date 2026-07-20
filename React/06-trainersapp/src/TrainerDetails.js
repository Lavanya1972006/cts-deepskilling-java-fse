import React from "react";
import { useParams } from "react-router-dom";
import trainersMock from "./trainersmock";

function TrainerDetails() {
    const { id } = useParams();

    const trainer = trainersMock.find(
        (t) => t.trainerId === id
    );

    if (!trainer) {
        return <h2>Trainer Not Found</h2>;
    }

    return (
        <div>
            <h2>Trainer Details</h2>

            <p><b>Name:</b> {trainer.name}</p>
            <p><b>Email:</b> {trainer.email}</p>
            <p><b>Phone:</b> {trainer.phone}</p>
            <p><b>Technology:</b> {trainer.technology}</p>

            <h3>Skills</h3>

            <ul>
                {trainer.skills.map((skill, index) => (
                    <li key={index}>{skill}</li>
                ))}
            </ul>
        </div>
    );
}

export default TrainerDetails;