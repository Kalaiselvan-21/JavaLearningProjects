package constructors;

// Constructor Overloading

public class Draw {

    Draw(){
        System.out.println("Draw object is created - No Arg Constructor");
    }

    String draw;
    Draw(String toDraw){
        draw = toDraw;
        System.out.println("Draw "+draw);
    }

    public static void main (String[] args)
    {
        Draw draw1 = new Draw();
        Draw draw2 = new Draw("Circle");

    }
}
