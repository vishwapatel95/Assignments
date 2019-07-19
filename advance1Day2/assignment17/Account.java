package advance1Day2.assignment17;

public abstract class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    Account() {
    }

    public Account(int accountNo, Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double balanceInquiry() {
        return balance;
    }

    public abstract void withDraw(double amount);

    public void deposit(double amount) {

        balance = balance + amount;
        System.out.println("Balance Deposited and balance is : : " + balance);
    }
}
