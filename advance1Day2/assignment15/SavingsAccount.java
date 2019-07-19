package advance1Day2.assignment15;

public class SavingsAccount extends Account {
    private double minimumBalance = 500;
    private int interestRate = 12;

    SavingsAccount() {

    }


    SavingsAccount(int accoutnNO, Customer customer, double balance) {

        super(accoutnNO, customer, balance);

    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 500) {
            balance = balance - amount;
            System.out.println("After withdrawing remaining amount is : " +balance);
        } else
            System.out.println("Minium balance Should be atleast 5000");
    }

    public void clculateInterest() {
        System.out.println("Interest is : " + (balance * interestRate) / 100);
    }
}
