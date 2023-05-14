import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //creating scanner object
        try (Scanner scnr = new Scanner(System.in)) {
            //asking the user what they wish to do
            System.out.println("\nEnter the number of the task you wish to complete:");
            System.out.println("1. Lodge a refund request");
            System.out.println("2. Create a poll");

            //gets users response
            int clientResponse = scnr.nextInt();

            //Trainee lodges a refund scenerio
            if(clientResponse == 1) {
                //Instantiating Actor Objects
                Trainee trainee = new Trainee();

                //trainee creates a cancel request for their current enrolment
                trainee.cancelTrainingRequest();
                //trainee is required to confirm their request
                trainee.confirmRequest();
            }

            //Poll Creating and Submission Scenario 
            else if(clientResponse == 2) {
                //Instantiating Actor Objects
                Trainee trainee = new Trainee();
                trainee.setProgramStatus("COS2023", true);
                Manager manager = new Manager();


                //creating sample questions for poll creation
                List<String> questions = new ArrayList<String>();
                questions.add("Q. What would rate the program out of 5?");
                questions.add("Q. How was your experience with the program?");
                questions.add("Q. What is the one thing we could improve upon?");
                questions.add("Q. Would you recommend the program to others?");

                //creating sample answer for the poll response
                List<String> response = new ArrayList<String>();
                response.add("I would rate the program 4/5.");
                response.add("My experience at the program was great.");
                response.add("You could add more time flexibility with the online training.");
                response.add("Yes, I would definitely recommend it to others.");

                //manager creates  a poll
                //printing questions for testing
                Poll pl = manager.createPoll("I0003", "12/01/2001", "COS2023", questions);

                //Checking if Trainee has completed the program
                System.out.println("\nChecking if trianee has completed his program");
                if(trainee.getProgramStatus("COS2023")){
                    //if trainee has complete his program
                    System.out.println("Trainee has completed his program\n");    

                    //setting up poll for the trianee
                    trainee.setPolls(pl);

                    //trainee answers the poll
                    trainee.answerPolls(response);

                    //manager views the response
                    manager.viewResponse();

                }else{
                    //if trainee hasn't completed his program
                    System.out.println("Sending Notification\n");
                    trainee.setNotifications("NOTICE: Complete Your Program to get a Poll");
                }
            }

            else {
                System.out.println("Invalid input");
            }
        }


    }
}
