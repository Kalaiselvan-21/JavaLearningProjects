package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public void Setoperations() {
        Set linkedhashset = new LinkedHashSet(); //Generics are not used here

        //adding
        linkedhashset.add(9);
        linkedhashset.add("A");
        linkedhashset.add("B");
        linkedhashset.add("C");
        linkedhashset.add("B");
        linkedhashset.add(1);


        Iterator<Integer> iterator = linkedhashset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main (String[] args){
        LinkedHashSetExample setExample = new LinkedHashSetExample();
        setExample.Setoperations();
    }
}
