abstract class User {
    //User Abstract Class Variables
    private String name;
    private int age;
    private String address;
    private int phNum;
    private String email;
    private String userName;
    private String password;

    //User Abstract Class Methods
    //To set the variables of the user
    public void setDetails(String name, int age, String address, int phNum, String email, String userName, String password){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phNum = phNum;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


    //To browse the course
    public void browse(){
        // TODO
        return;
    }
}
