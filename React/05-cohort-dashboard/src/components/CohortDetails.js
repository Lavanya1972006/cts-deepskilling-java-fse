import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails(props) {

    const headingStyle = {
        color: props.status === "Ongoing" ? "green" : "blue"
    };

    return (
        <div className={styles.box}>

            <h3 style={headingStyle}>
                {props.name}
            </h3>

            <dl>

                <dt><b>Started On</b></dt>
                <dd>{props.startedOn}</dd>

                <dt><b>Current Status</b></dt>
                <dd>{props.status}</dd>

                <dt><b>Coach</b></dt>
                <dd>{props.coach}</dd>

                <dt><b>Trainer</b></dt>
                <dd>{props.trainer}</dd>

            </dl>

        </div>
    );
}

export default CohortDetails;