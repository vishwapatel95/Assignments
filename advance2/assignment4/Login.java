package advance2.assignment4;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<Integer,String> loginMap = new HashMap<>();

    public void addLoginIdPassword(int id, String password){
        loginMap.put(id,password);
    }
}
