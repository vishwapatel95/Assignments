package advance3.assignment2;

import java.io.*;

public class CustomerFileDB {
    String file = "/Users/vishwapatel/Desktop/customer.dat";

    public int saveCustomer(Customer customer){
        int status = -1;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            String data = customer.getCustomerId() + ":" + customer.getCustomerName() + "\n";
            bufferedWriter.write(data);
            bufferedWriter.flush();
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

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String[] data= null;
            String input =  bufferedReader.readLine();
            while (input!=null){
                data = input.split(":");
                if (Integer.parseInt(data[0]) == customerId){
                    customer = new Customer();
                    customer.setCustomerId(Integer.parseInt(data[0]));
                    customer.setCustomerName(data[1]);
                    break;
                }

                input = bufferedReader.readLine();
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }finally {
            if (null!=bufferedReader){
                try {
                    bufferedReader.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }

            if (null!=fileReader){
                try {
                    fileReader.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
        return customer;
    }
}

