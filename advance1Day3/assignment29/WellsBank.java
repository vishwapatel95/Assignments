package advance1Day3.assignment29;

import advance1Day3.assignment28.Customer;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerId(202);
        customer.setCustomerName("John");
        customer.setCustomerAddress("Irving");
        customer.setPincode(98087);

        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerAddress());
        System.out.println(customer.getPincode());
    }
}
