package advance3.assignment3;

import java.io.*;

public class Debug implements Serializable {
    public static void main(String []args){
        Customer customer=new Customer(1001,"Tan");
        SavingsAccount sb1=new SavingsAccount(9001,customer,2000,5,1000);
        try {
            FileOutputStream fileOutputStream = new
                    FileOutputStream("data.ser");
            ObjectOutputStream objStream = new ObjectOutputStream(fileOutputStream);
            objStream.writeObject(sb1);
            objStream.close();

            FileInputStream fileInput = new FileInputStream("data.ser");
            ObjectInputStream bufferedInputStream = new ObjectInputStream(fileInput);
            sb1 = (SavingsAccount)bufferedInputStream.readObject();
        }catch (Exception e){
            e.getMessage();
        }
    }

}
