package Collection;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public void TreeSetoperations() {
        TreeSet<Integer> treeset = new TreeSet<Integer>();

        //adding
        treeset.add(1);
        treeset.add(9);
        treeset.add(5);
        treeset.add(8);
        treeset.add(6);
        treeset.add(2);
        System.out.println("Given Treeset values: "+treeset);

        System.out.println("First element: "+treeset.first());
        System.out.println("Last element: "+treeset.last());
        System.out.println("Values lesser than 8: "+treeset.headSet(8)); // Prints 1,2,5,6
        System.out.println("Values greater than or equal to 5: "+treeset.tailSet(5)); // Prints 5,6,8,9
        System.out.println("Values from FromValue to lessthan LastValue: "+treeset.subSet(2,8)); //Prints 2,5,6
        treeset.remove(6);
        System.out.println("After removing value 6: "+treeset);

        Iterator<Integer> iterator = treeset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        Iterator<Integer> iterator1 = treeset.descendingIterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        }


    }

    public static void main (String[] args){
        TreeSetExample setExample = new TreeSetExample();
        setExample.TreeSetoperations();
    }
}
