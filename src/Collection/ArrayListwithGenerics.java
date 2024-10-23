package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListwithGenerics {

    public static void main (String[] args){
        List <String> arrayList = new ArrayList<String>();

        arrayList.add("Benz");
        arrayList.add("BMW");
        arrayList.add("Bentley");
        arrayList.add("Porsche");
        arrayList.add("BMW");
        System.out.println(arrayList);

        //To get the value stored in 3rd index position
        System.out.println(arrayList.get(3));

        //To get the 1st index position of BMW
        System.out.println(arrayList.indexOf("BMW"));

        //To get the last index position of BMW
        System.out.println(arrayList.lastIndexOf("BMW"));

        //To copy the arraylist into another arraylist
        List <String>anotherlist = new ArrayList<String>();
        anotherlist.addAll(arrayList);
        System.out.println(anotherlist);

        //Empty the list
        anotherlist.clear();
        System.out.println(anotherlist);

        //Remove from the list
        arrayList.remove(0); //Benz will be removed
        System.out.println(arrayList);
        arrayList.remove("BMW"); //Removes 1st BMW occurence
        System.out.println(arrayList);

        //Update the arraylist
        arrayList.set(0, "Bentley new");
        System.out.println(arrayList);

       /* for (String string : arrayList) {
            System.out.println(string);
        }*/
            ListIterator<String> iterator = arrayList.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        System.out.println("Reverse");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


    }
}
