package advance1Day2.assignment15;

public class SavingsAccount extends Account {
    private double minimumBalance = 500;
    private int interestRate = 12;

    public SavingsAccount() {
    }

    public SavingsAccount(int accountNo, Customer customer, double balance) {
        super(accountNo, customer, balance);
    }

    public void withDraw(double amount){
        if (this.balance > minimumBalance && this.balance > amount){
            this.balance = this.balance - amount;
        }else{
            System.out.println("Withdrawl not processed");
        }
    }

    public void calculateInterest(){
        double interest = (this.balance * interestRate)/100;
    }
}
