import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//extending the user abstract Class
public class Trainee extends User{
    //Trainee Variables
    private int registrationId; //Registration Id of the Trainee
    private List<String> programIds = new ArrayList<String>();//Program Ids of all the programs Trainee has registered to
    private List<Boolean> programStatus = new ArrayList<Boolean>();//Status telling if a program has been completed
    private List<Poll> polls = new ArrayList<Poll>(); //All the Polls the Trainee hasn't answered
    private List<String> notifications = new ArrayList<String>(); //All the notification the Trainee gets

    //Trainee Methods
    //Adds registered programs and their status
    public void setProgramStatus(String programId, boolean status){
        programIds.add(programId);
        programStatus.add(status);
    }

    //Checks if a particular program has been completed
    public boolean getProgramStatus(String programId){
        boolean status = false;
        for(int i = 0; i < programIds.size(); i ++){
            if(programIds.get(i).equals(programId)){
                status = programStatus.get(i);
            }
        }
        return status;
    }

    //To add Polls for response from the trainee
    public void setPolls(Poll newPoll){
        System.out.println("Sending Poll to Trainee\n");
        polls.add(newPoll);
    }

    //To get the Polls that are not responded to yet
    public List<Poll> getPolls(){
        return polls;
    }

    //To answer the polls
    public void answerPolls(List<String> answer){
        List<Poll> pollToAnswer = this.getPolls();
        List<String> response = new ArrayList<String>(); 

        //Trainee answering all the due Polls
        for(int i = 0; i < pollToAnswer.size(); i++){
            List<String> questions = pollToAnswer.get(i).getQuestions();

            System.out.println("Trainee Answering Poll:\n");
            for(int j = 0; j < questions.size(); j ++){
                System.out.println("Q." + i + " " + questions.get(i));
                String line = answer.get(i);
                System.out.println("Answer: " + line);
                response.add(line);
            }
            pollToAnswer.get(i).setResponse(response);
        }
    }

    //To add notifications
    public void setNotifications(String notificaion){
        notifications.add(notificaion);
    }

}
