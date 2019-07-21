package advance2.assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EntrySet {
    public void printRecords(Set<String> set){
        if (set.isEmpty()){
            System.out.println("Set is empty");
        }else {
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                System.out.println("Set elements are : " +iterator.next());

            }
        }
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Second");
        set.add("Third");
        set.add("Four");
        EntrySet entrySet = new EntrySet();
        entrySet.printRecords(set);


    }
}
