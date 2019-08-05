package advance3.assignment3;

import advance3.assignment3.Customer;

public class Account {
    private int accountNo;
    private advance3.assignment3.Customer customer;
    protected double balance;

    public Account(int accountNo, advance3.assignment3.Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Account() {
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public advance3.assignment3.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
