package Basic;

public class BankAccount {
    Long accountNumber = 12728276L;
    Integer accountBalance= 350;
    String accountName = "Kalai";

    public void getBalance(){
        System.out.println("Balance is: "+accountBalance);
    }
    public static void main (String[] args){
        BankAccount account = new BankAccount();
        account.getBalance();

    }
}
