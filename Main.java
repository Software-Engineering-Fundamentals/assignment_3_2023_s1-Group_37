import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validInput = false;
        
        // Creating scanner object
        try (Scanner scnr = new Scanner(System.in)) {
            while (!validInput) {
                // Asking the user what they wish to do
                System.out.println("\nEnter the number of the task you wish to complete:");
                System.out.println("1. Lodge a refund request");
                System.out.println("2. Create a poll");

                // Gets user's response
                int clientResponse = scnr.nextInt();

                // Trainee lodges a refund scenario
                if (clientResponse == 1) {
                    // Instantiating Actor Objects
                    Trainee trainee = new Trainee();

                    // Trainee creates a cancel request for their current enrolment
                    trainee.cancelTrainingRequest();
                    // Trainee is required to confirm their request
                    trainee.confirmRequest();
                    validInput = true; // Valid input, exit the loop
                }
                // Poll Creating and Submission Scenario
                else if (clientResponse == 2) {
                    // Instantiating Actor Objects
                    Trainee trainee = new Trainee();
                    trainee.setProgramStatus("COS2023", true);
                    Manager manager = new Manager();

                    // Creating sample questions for poll creation
                    List<String> questions = new ArrayList<String>();
                    questions.add("Q. What would rate the program out of 5?");
                    questions.add("Q. How was your experience with the program?");
                    questions.add("Q. What is the one thing we could improve upon?");
                    questions.add("Q. Would you recommend the program to others?");

                    // Creating sample answer for the poll response
                    List<String> response = new ArrayList<String>();
                    response.add("I would rate the program 4/5.");
                    response.add("My experience at the program was great.");
                    response.add("You could add more time flexibility with the online training.");
                    response.add("Yes, I would definitely recommend it to others.");

                    // Manager creates a poll
                    // Printing questions for testing
                    Poll pl = manager.createPoll("I0003", "12/01/2001", "COS2023", questions);

                    // Checking if Trainee has completed the program
                    System.out.println("\nChecking if trainee has completed their program");
                    if (trainee.getProgramStatus("COS2023")) {
                        // If trainee has completed their program
                        System.out.println("Trainee has completed their program\n");

                        // Setting up poll for the trainee
                        trainee.setPolls(pl);

                        // Trainee answers the poll
                        trainee.answerPolls(response);

                        // Manager views the response
                        manager.viewResponse();
                    } else {
                        // If trainee hasn't completed their program
                        System.out.println("Sending Notification\n");
                        trainee.setNotifications("NOTICE: Complete Your Program to get a Poll");
                    }
                    validInput = true; // Valid input, exit the loop
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }
}
