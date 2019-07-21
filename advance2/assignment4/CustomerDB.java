package advance2.assignment4;

import java.util.*;

public class CustomerDB {
    private List<Customer> list = new ArrayList<>();

    public boolean addCustomer(Customer customer){
        boolean status=false;

        status = list.add(customer);
        return status;
    }

    public List<Customer> getAllCustomer(){
        return list;
    }

    public Set<Integer> getLoanAvailedCustomers() {
        //creating the set of customer ids
        Set<Integer> loanAvailedCustomers = new TreeSet<>();
        //getting the iterator for the list of customers
        Iterator<Customer> customerIterator = list.iterator();
        while (customerIterator.hasNext()) {
            Customer customer = customerIterator.next();

            if (customer.isLoanAvailed()) {
                loanAvailedCustomers.add(customer.getCustomerId());
            }
        }
        return loanAvailedCustomers;
    }


}
