package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {


    public void linkedhashmapexample(){

        LinkedHashMap<String, String> linkedhashMap = new LinkedHashMap<String, String>();

        linkedhashMap.put("Kalai","BMW");
        linkedhashMap.put("MONISHA","BENZ");
        linkedhashMap.put("KAYAL","BENTLEY");
        System.out.println("Print the LinkedHashmap values: "+linkedhashMap);


        HashMap<String, String> hashMap = new LinkedHashMap<String, String>();

        hashMap.put("KALAI","BMW");
        hashMap.put("MONISHA","BENZ");
        hashMap.put("KAYAL","BENTLEY");
        System.out.println("Print the Hashmap values: "+hashMap);


    }
    public static void main(String[] args){
        LinkedHashMapExample mapExample = new LinkedHashMapExample();
        mapExample.linkedhashmapexample();
    }
}
