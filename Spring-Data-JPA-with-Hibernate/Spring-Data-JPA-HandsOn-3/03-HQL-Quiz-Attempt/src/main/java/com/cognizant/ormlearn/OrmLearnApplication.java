package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private AttemptService attemptService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAttemptDetails();
    }

    private void testGetAttemptDetails() {

        LOGGER.info("Start");

        // Change these values according to the data in your database
        Attempt attempt = attemptService.getAttempt(1, 1);

        if (attempt == null) {
            LOGGER.info("No Attempt Found");
            return;
        }

        LOGGER.info("Username : {}", attempt.getUser().getName());
        LOGGER.info("Attempted Date : {}", attempt.getAttemptedDate());

        for (AttemptQuestion aq : attempt.getAttemptQuestions()) {

            Question question = aq.getQuestion();

            LOGGER.info("Question : {}", question.getText());

            for (Options option : question.getOptions()) {

                boolean selected = false;

                if (aq.getAttemptOptions() != null) {
                    for (AttemptOption ao : aq.getAttemptOptions()) {
                        if (ao.getOption().getId() == option.getId()) {
                            selected = ao.isSelected();
                            break;
                        }
                    }
                }

                LOGGER.info("{}   {}   {}",
                        option.getText(),
                        option.getScore(),
                        selected);
            }

            LOGGER.info("-------------------------------------");
        }

        LOGGER.info("End");
    }
}