package Test1;

import java.util.*;

public class tes {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Vishwa", 1);
        list.put("Tirth",2);
        list.put("Patel",3);

//        list.forEach((k,v) -> {
//            System.out.println("key " + k + "Value" + v);
//        });
//
//        for (Map.Entry <String, Integer> li : list.entrySet()){
//            System.out.println("key" + li.getKey() + "value" + li.getValue());
//
//        }

        Iterator <Map.Entry<String,Integer>> li = list.entrySet().iterator();

        Set<String> set = new HashSet<>();
        set.add("Vishwa");
        set.add("Tirth");
        set.add("Patel");

        Iterator se = set.iterator();
        while (se.hasNext()){
            System.out.println(se.next());
        }
    }
}
