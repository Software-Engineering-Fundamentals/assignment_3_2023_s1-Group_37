abstract class User {
    //User Abstract Class Variables
    private String name; //Name of the User
    private int age; //Age of the User
    private String address; //Address of the User
    private int phNum;// Phone Number of the User
    private String email; // Email of the User
    private String userName;// Username of the User to login
    private String password;// password of the User to login

    //User Abstract Class Methods
    //To Login
    public boolean login(String username, String password){
        return true;
    }

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
