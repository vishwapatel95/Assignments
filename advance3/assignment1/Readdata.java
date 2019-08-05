package advance3.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readdata {
    public static String acceptstring(){
        String stringData = null;
        BufferedReader input = null;
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            stringData = input.readLine();
        }catch (IOException ioException){
            System.out.println("Error in accepting data");
        }finally {
            if (input!=null){
                input = null;
            }
        }
        return stringData;
    }
}
