import java.util.Scanner;

public class Cancelation {

    //VARS
    Scanner scnr = new Scanner(System.in);
    String response;
    FinanceManager finMan = new FinanceManager();

    //METHODS
    public String confirmRefund() {
        System.out.println("Message to Trainee: Are you sure you wish to continue?");
        System.out.println("(type yes if you wish to continue, anything else to cancel)\n");
        String response = scnr.nextLine();
        return response;
    }

    public void refundRequest() {
        System.out.println("Sending refund request to Finance Manager\n");
        finMan.approveRefund();

    }


}
