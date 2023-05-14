public class FinanceManager extends User{
    //VARS
    Refund refund = new Refund();

    //FinanceManager Methods
    public void approveRefund() {
        System.out.println("Recieved refund request\n");
        System.out.println("Checking if refund is valid\n");
        System.out.println("Refund is valid, refund approved\n");

        //Sends appreved request off to the system to be processed
        refund.refundApproved();
    }
}