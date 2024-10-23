package Basic;

public class FindOutput {

    private FindOutput(Object o) {
        System.out.println("Object");
    }

    private FindOutput(double[] d) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        new FindOutput(null);
    }
}
