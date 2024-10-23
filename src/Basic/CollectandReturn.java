package Basic;

public class CollectandReturn {
    Integer collectAmount = 1000;
    public Integer collectandgive(){
        System.out.println("Amount Collected "+collectAmount);
        return collectAmount;
    }

    public static void main (String[] args){
        CollectandReturn collect = new CollectandReturn();
        Integer amount = collect.collectandgive();
        System.out.println("Received");


    }



}
