package ExceptionHandling;

public class TryCatchFinally {

    public static void main (String[] args)
    {
        try{
            System.out.println("Try Block");
            int a=2;
            int b=0;
            int c=a/b;

        } catch (Exception e) {
            System.out.println("Number cannot divide by 0");
        }
        finally {
            System.out.println("Finally Block");
        }

    }
}
