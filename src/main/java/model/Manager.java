package src.main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User{
    //Variables
    private List<Poll> pollsCreated = new ArrayList<Poll>();


    //Manager Methods
    //To Create a Poll
    public Poll createPoll(String id, String date, String programId, List<String> questions){
        System.out.println("Manager is creating a Poll\n");
        Poll pl = new Poll();
        pl.setPollDetails(id, date, programId); //setting Details for the Poll
        pl.setQuestions(questions); //setting up question for the Poll
        System.out.println("Setting the questions for the poll\n");
        for(int i = 0; i<questions.size(); i ++){
            System.out.println(questions.get(i));
        }

        pollsCreated.add(pl); //Saving Poll Created
        return pl;
    }

    public void viewResponse(){
        for(int i = 0; i < this.pollsCreated.size(); i++){
            //gets questions
            List<String> questions = this.pollsCreated.get(i).getQuestions();
            //gets response
            List<String> response = this.pollsCreated.get(i).getResponse();

            System.out.println("\nManager Viewing Poll:\n");
            for(int j = 0; j< questions.size(); j ++){
                System.out.println("Q. "+ questions.get(j));
                System.out.println("Answer: "+response.get(j));
            }
        }
    }
}
