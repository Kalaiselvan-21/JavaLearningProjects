package ExceptionHandling;

public class SingleTryCatch {

    public static void main (String[] args)
    {
        try{
            int a=2;
            int b=0;
            int c=a/b;
        } catch (Exception e) {
            System.out.println("Number cannot divide by 0");
        }
    }
}
