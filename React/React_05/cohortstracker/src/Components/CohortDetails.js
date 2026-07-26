import styles from '../CohortDetails.module.css';

function CohortDetails({ cohort }) {

    return (

        <div className={styles.box}>

            <h3
                className={
                    cohort.currentStatus.toLowerCase() === "ongoing"
                        ? styles.green
                        : styles.blue
                }
            >
                {cohort.cohortCode}
            </h3>

            <dl>

                <dt>Started On</dt>
                <dd>{cohort.startedOn}</dd>

                <dt>Current Status</dt>
                <dd>{cohort.currentStatus}</dd>

                <dt>Coach</dt>
                <dd>{cohort.coach}</dd>

                <dt>Trainer</dt>
                <dd>{cohort.trainer}</dd>

            </dl>

        </div>

    );

}

export default CohortDetails;