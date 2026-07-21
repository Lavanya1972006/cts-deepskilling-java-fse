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
            <h2>Trainers Details</h2>

            <p>
                <b>{trainer.name} ({trainer.technology})</b>
            </p>
           <br></br>
            <p>{trainer.email}</p>
            <br></br>
            <p>{trainer.phone}</p>
            
            <ul>
                {trainer.skills.map((skill, index) => (
                    <li key={index}>{skill}</li>
                ))}
            </ul>
        </div>
    );
}

export default TrainerDetails;