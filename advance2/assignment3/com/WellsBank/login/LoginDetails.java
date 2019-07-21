package advance2.assignment3.com.WellsBank.login;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoginDetails {
    public void addSameKey(Map<Integer,String> map){
        if (map.containsKey(1003)){
            System.out.println("Key is already present in map");
        }else {
            map.put(1003,"John");
        }
    }

    public void printLoginDetails(Map<Integer,String> map){
        Set<Integer> set = map.keySet();
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1000,"Sam");
        map.put(1001,"Tom");
        map.put(1002,"Zen");
        map.put(1003,"Zen");
        System.out.println("Map before adding the same key 1003"+
                map);

        LoginDetails loginDetails = new LoginDetails();
        loginDetails.addSameKey(map);
        System.out.println("Value for 1003, after addSameKey() : "+map.get(1003));
                System.out.println("Map after adding the same key 1003"+
                        map);

        loginDetails.printLoginDetails(map);
    }
}
