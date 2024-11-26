package BasicPrograms;

import java.util.Arrays;

public class ReverseWords {

    public static void main (String[] args)
    {

        String givenString = "I ate an apple";
        String reverString="";
        
        String tempString[] = givenString.split(" ");
        System.out.println(Arrays.toString(tempString));
        
        for(int i=tempString.length-1;i>=0;i--)
        {
        	reverString = reverString+tempString[i]+" ";
        }
        System.out.println(reverString);

    }
}
