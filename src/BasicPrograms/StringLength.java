package BasicPrograms;

import java.util.Scanner;

public class StringLength {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String given = scanner.nextLine();

        char[] character = given.toCharArray();

        int length = 0;
        for(char c : character){
            length++;
        }System.out.println(length);
    }
}
