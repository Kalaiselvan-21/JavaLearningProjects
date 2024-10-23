package Polymorphism;

//Method Overloading

public class AdditionOverloading {

    int add(int a, int b){
        int c = a+b;
        return c;
    }
    int add(int a, int b, int c){
        int d = a+b+c;
        return d;
    }

    public static void main (String[] args){
        AdditionOverloading overloading = new AdditionOverloading();
        System.out.println(overloading.add(3,5));
        System.out.println(overloading.add(1,2,3));

    }
}
