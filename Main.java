import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
    //Poll Creating and Submission Scenario    
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

    //Trainee lodges a refund scenerio
        //trainee creates a cancel request for their current enrolment
        trainee.cancelTrainingRequest();
        //trainee has to confirm their request
        trainee.confirmRequest();
    }
}
