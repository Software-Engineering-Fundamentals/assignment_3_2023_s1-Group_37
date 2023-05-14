package src.main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Poll {
    //Variables
    private List<String> response = new ArrayList<String>(); //Response of the Poll
    private List<String> questions = new ArrayList<String>(); //Questions of the Poll
    private String id;//Poll Id
    private String date;//Poll Date
    private String programId;//Program to which Poll is associated

    //Method
    //setting up Poll Details
    public void setPollDetails(String id, String date, String programId){
        this.id = id;
        this.date = date;
        this.programId = programId;
    }

    //setting up questions for the poll
    public void setQuestions(List<String> questions){
        this.questions = questions;
    }

    //Getter for questions
    public List<String> getQuestions(){
        return this.questions;
    }

    //Setter for response
    public void setResponse(List<String> response){
        this.response = response;
    }

    //Getter for response
    public List<String> getResponse(){
        return this.response;
    }
}
