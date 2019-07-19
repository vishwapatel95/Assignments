package advance1Day2.assignment1314;

public class CurrentAccount extends Account {
    private double currentAmount;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }

    public void withdrawAmount(double amount){
        if ((this.balance-amount) > getEligibilityAmount()){
            this.balance = this.balance - amount;
        }else {
            System.out.println("Withdrawl not procced ");
        }
    }


    public double getEligibilityAmount(){
        return balanceEnquiry() + currentAmount ;
    }
}
