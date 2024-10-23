package BasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

    public static void main(String[] args){
        String given="India";
        char[] array = given.toCharArray();

        String reversed = "";
        for(int i=array.length-1;i>=0;i--){
            reversed=reversed+array[i];

        }System.out.println("Reversed String: "+reversed);

        System.out.println("******************");
        System.out.println("Using collections");
        List<Character> characterList = new ArrayList<Character>();

        for (Character character : array)
            characterList.add(character);
        System.out.println("Character List: "+characterList);

        ListIterator<Character> iterator = characterList.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Reverse Iteration: ");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
