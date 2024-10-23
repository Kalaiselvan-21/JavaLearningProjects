package Basic;

public class StaticKeyword {

    static {
        System.out.println("Static method 1 executed");
    }
    static {
        System.out.println("Static method 2 executed");
    }

    public static void main (String[] args){
        System.out.println("Main method executed");
    }
}
