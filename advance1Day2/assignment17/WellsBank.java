package advance1Day2.assignment17;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1, "JOHN", "Irving", 91776);
        OverDraftAccount johnSA = new OverDraftAccount(101, john, 1000,500);
        transcation(johnSA,1000);

        Customer jenny = new Customer(2, "Jenny", "Austin", 91776);

        johnSA.withDraw(1000);
        johnSA.deposit(2000);

    }

    public static void transcation(Account account, double amount){
        account.deposit(amount);
        account.withDraw(amount);

    }
}
