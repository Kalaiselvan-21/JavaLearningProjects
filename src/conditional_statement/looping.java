package conditional_statement;

public class looping {

    int times;
    public void forloop () {
        for(times=0;times<=25;times++)
        {
        System.out.println("For loop - Print 25");
        }
    }

    public void whileloop(){
        times=0;
        while(times<=25){
            System.out.println("While loop - 25 times");
            times++;
        }
    }

    public void dowhileloop(){
        times=0;
    do{
            System.out.println("Do While loop - 25 times");
            times++;
        }while(times<25);
    }
public static void main (String[] args){
    looping loop = new looping();
    loop.forloop();
    loop.whileloop();
    loop.dowhileloop();
}
}

