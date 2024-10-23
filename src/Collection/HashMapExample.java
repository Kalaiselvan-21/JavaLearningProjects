package Collection;

import java.util.HashMap;

public class HashMapExample {


    public void hashmapexample(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"BMW");
        hashMap.put(3,"BENZ");
        hashMap.put(4,"BENTLEY");
        hashMap.put(7,"AUDI");
        hashMap.put(2,"TATA");
        hashMap.put(9,"HYUNDAI");
        System.out.println("Print the Hashmap values: "+hashMap);

        System.out.println(hashMap.get(7));
        System.out.println("Print only the Keys: "+hashMap.keySet());
        System.out.println("Print only the Values: "+hashMap.values());

        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        System.out.println(hashMap.clone());




    }
    public static void main(String[] args){
        HashMapExample mapExample = new HashMapExample();
        mapExample.hashmapexample();
    }
}
