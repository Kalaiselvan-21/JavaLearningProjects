package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSetExample {

    public void Setoperations() {
        Set<Integer> hashset = new HashSet<Integer>();

        //adding
        hashset.add(3);
        hashset.add(5);
        hashset.add(7);
        hashset.add(9);
        hashset.add(3);

        Iterator<Integer> iterator = hashset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main (String[] args){
        HashSetExample setExample = new HashSetExample();
        setExample.Setoperations();
    }
}
