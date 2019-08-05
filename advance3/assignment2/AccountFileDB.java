package advance3.assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AccountFileDB implements Serializable{
    String file = "/Users/vishwapatel/Desktop/account.dat";

    public int saveAccount(Customer customer){
        int status = -1;
        FileOutputStream fileWriter = null;
        ObjectOutputStream bufferedWriter = null;
        try {
            fileWriter = new FileOutputStream(file,true);
            bufferedWriter = new ObjectOutputStream(fileWriter);
            String data = customer.getCustomerId() + ":" + customer.getCustomerName() + ":" + customer.getAccountNo() + ":" + customer.getBalance() + "\n";
            bufferedWriter.writeObject(data);
            bufferedWriter.close();
            fileWriter.close();
            status = 0;
        }catch (IOException ioException){
            status =2;
            ioException.printStackTrace();
        }finally {
            if (null!=bufferedWriter){
                try {
                    bufferedWriter.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }

            if (null!= fileWriter){
                try {
                    fileWriter.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
        return status;
    }

    public Customer getCustomer(int customerId){
        Customer customer = null;
        FileInputStream fileReader = null;
        ObjectInputStream objectReader = null;
        try {
            fileReader = new FileInputStream(file);
            objectReader = new ObjectInputStream(fileReader);
            String[] data= null;
            String input =  objectReader.readObject().toString();
            while (input!=null){
                data = input.split(":");
                if (Integer.parseInt(data[0]) == customerId){
                    customer = new Customer();
                    customer.setCustomerId(Integer.parseInt(data[0]));
//                    account.setCustomer(customer.setCustomerName(data[1]));
                    customer.setCustomerName(data[1]);
                    customer.setAccountNo(Integer.parseInt(data[2]));
                    customer.setBalance(Double.parseDouble(data[3]));
                    break;
                }
//                input = bufferedReader.readLine();
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        return customer;
    }
}
