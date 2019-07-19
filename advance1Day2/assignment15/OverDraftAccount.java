package advance1Day2.assignment15;

public class OverDraftAccount extends Account {
    private double currentAmount;

    public OverDraftAccount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public OverDraftAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }


    public void withDraw(double amount) {
        System.out.println("Withdrawing...." + amount);

        if (amount <= balance) balance -= amount;
        else if ((balance - amount) <= 0 && ((balance + currentAmount) - amount >= 0)) {
            double diff = amount - balance;
            balance = 0;
            currentAmount = currentAmount - diff;

        }
//  if(amount<=currentAmount)currentAmount=currentAmount-amount;
//  else if((currentAmount-amount)<=0 && ((balance+currentAmount)-amount)>=0)balance=balance-amount;
        else
            System.out.println("You are not eligible for the Withdraw " + amount + "and Limit is " + currentAmount + balance);
    }

    public double getEligiblityAmount() {
// if(balance<=0)return 0-currentAmount;
        System.out.println("Balance is ::: " + balanceInquiry() + ":: Current Amount Left is :" + currentAmount);
        return balanceInquiry() + currentAmount;
    }
}
