package Polymorphism;

public class Son extends Parents {

    @Override
    public void marriage() {
        System.out.println("Marrying my lover");
        System.out.println("Use your grandpa's properties too");
    }

    public static void main(String[] args) {

        {
            Parents parents = new Son();
            parents.properties();
            parents.marriage();
        }
    }
}