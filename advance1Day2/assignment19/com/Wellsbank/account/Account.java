package advance1Day2.assignment19.com.Wellsbank.account;

import advance1Day2.assignment19.com.Wellsbank.customer.Customer;

public class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    public Account() {
    }

    public Account(int accountNo, Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double balanceEnquiry(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}
