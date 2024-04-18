package org.example.task2.age_validator;

/**
 * Validator class for checking adulthood by age.
 */
public class AgeValidator {

    /**
     * Method that checks and returns adult status.
     */
    public static String validateAge(int finalAge) {
        String status;
        if (finalAge >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }
        return status;
    }
}
