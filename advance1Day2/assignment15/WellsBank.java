package advance1Day2.assignment15;

public class WellsBank {
    public static void main(String[] args) {
//        Customer john = new Customer(2,"John","Irving",39021);
//        SavingsAccount johnSa = new SavingsAccount(101,john,2000);
//        johnSa.deposit(1000);
//        System.out.println(johnSa.balanceEnquiry());
//
//        johnSa.withDraw(1600);
//        System.out.println(johnSa.balanceEnquiry());
//
//        johnSa.withDraw(2000);
//        System.out.println(johnSa.balanceEnquiry());


        Customer jenny = new Customer(142,"Jenny","Seattle",98087);
        OverDraftAccount currentAccount = new OverDraftAccount(1423312,jenny,500,2000);
        transaction(currentAccount,1000);
        System.out.println(currentAccount.balanceEnquiry());
        currentAccount.withdrawAmount(1000);
        System.out.println(currentAccount.balanceEnquiry());
        currentAccount.withdrawAmount(4000);
        System.out.println(currentAccount.balanceEnquiry());
    }

    public static void transaction(Account account, double amount){
        account.deposit(amount);
    }
}
