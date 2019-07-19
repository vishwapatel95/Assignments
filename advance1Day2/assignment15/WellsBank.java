package advance1Day2.assignment15;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1, "JOHN", "Irving", 91776);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
        transcation(johnSA,1000);

        Customer jenny = new Customer(2, "Jenny", "Austin", 91776);

        johnSA.withdraw(1000);

    }

    public static void transcation(Account account, double amount){
        account.deposit(amount);

    }
}
