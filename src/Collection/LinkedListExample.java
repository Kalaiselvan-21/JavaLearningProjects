package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

    public void LLOperations(){

        List <Integer> linkedlist = new LinkedList<Integer>();

        //adding
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.add(1);
        linkedlist.add(6);
        linkedlist.add(9);
        System.out.println(linkedlist);

        linkedlist.addFirst(1);
        System.out.println("After adding 1st element in linked list: "+linkedlist);
        linkedlist.addLast(10);
        System.out.println("After adding last element in linked list: "+linkedlist);

        //Retrieving Operation
        System.out.println("3rd Index Element in the list: "+linkedlist.get(4));
        System.out.println("Get the first index element: "+linkedlist.getFirst());

        //Removal operation
        linkedlist.remove(3);
        System.out.println("After remvoing 3rd index element in linked list: "+linkedlist);

        //Iterate and Print
        ListIterator<Integer> iterator = linkedlist.listIterator();
        while(iterator.hasNext()){
            System.out.println("Iterate and Print: " +iterator.next());
        }

        //Using for each loop and Print
        for(Integer integer : linkedlist){
            System.out.println(integer);
        }
    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.LLOperations();
    }

}
