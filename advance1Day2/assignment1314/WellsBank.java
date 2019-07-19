package advance1Day2.assignment1314;

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
        CurrentAccount currentAccount = new CurrentAccount(1423312,jenny,500,2000);
        currentAccount.deposit(1500);
        System.out.println(currentAccount.balanceEnquiry());
        currentAccount.withdrawAmount(1000);
        System.out.println(currentAccount.balanceEnquiry());
        currentAccount.withdrawAmount(1500);
        System.out.println(currentAccount.balanceEnquiry());
//        currentAccount.withdrawAmount(10000);
//        System.out.println(currentAccount.balanceEnquiry());


    }

}
