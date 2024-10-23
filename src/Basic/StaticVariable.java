package Basic;

public class StaticVariable {

    static int accountbalance=0;
    String depositedBy;

    public static void main (String[] args){
        StaticVariable object1 = new StaticVariable();
        accountbalance=1000;


        StaticVariable object2 = new StaticVariable();
        accountbalance=2000;
        object2.depositedBy = "Kalai";

        System.out.println("Account Balance: "+accountbalance+" DepositedBy: "+object1.depositedBy);
        System.out.println("Account Balance: "+accountbalance+" DepositedBy: "+object2.depositedBy);

    }
}
