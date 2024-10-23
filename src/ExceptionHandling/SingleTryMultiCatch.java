package ExceptionHandling;

public class SingleTryMultiCatch {

    public static void main(String[] args){
        try{
            int a=2;
            int b=0;
            int c=a/b;
        } catch (ArithmeticException e) {
            System.out.println("This is due to Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Number cannot be divided by 0");
        }
    }

}
