package advance1Day2.assignment15;

public class OverDraftAccount extends Account {
    private double currentAmount;

    public OverDraftAccount() {
    }

    public OverDraftAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }

    public void withdrawAmount(double amount){
        if (this.balance > amount){
            this.balance = this.balance - amount;
        }else if ((this.balance + currentAmount) > amount){
            this.balance = this.balance - amount;
        }else if ((this.balance+ currentAmount) < amount){
            System.out.println("Withdrawl not procced ");
        }
    }

    @Override
    public double balanceEnquiry() {
        return super.balanceEnquiry() + currentAmount;
    }

    public double getEligibilityAmount(){
        return balanceEnquiry() + currentAmount ;
    }

}
