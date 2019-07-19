package advance1;

public class Assignment4 {
    private String customerID;
    private String customerName;
    private String address;
    private int pinCode;

    public static void main (String [] args){
        Assignment4 customer = new Assignment4();
        customer.customerID = "1234";
        customer.customerName = "Jayant";
        customer.address = "PHA-Sawan Apts., Yadavgiri, Mysore";
        //statement 4
        customer.pinCode = 570020; //statement 5
        System.out.println("Customer ID " + customer.customerID);
        System.out.println("Customer Name " + customer.customerName);
        System.out.println("Customer Address " + customer.address);
        System.out.println("Customer Pin Code " + customer.pinCode);
    }
}
