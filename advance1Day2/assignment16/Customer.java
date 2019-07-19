package advance1Day2.assignment16;

public class Customer {
    private int customerID;
    private String cutomerName, customerAddress;
    private int pincode;

    public Customer(int customerID, String cutomerName, String customerAddress, int pincode) {
        this.customerID = customerID;
        this.cutomerName = cutomerName;
        this.customerAddress = customerAddress;
        this.pincode = pincode;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
