package advance1Day2.assignment26;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1, "JOHN", "Irving", 91776);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
        try{
            transcation(johnSA,1500);
        }catch (InsufficientBalanceException e){

            System.out.println("Exception occured");
        }

//        Customer jenny = new Customer(2, "Jenny", "Austin", 91776);

//        try {
//            johnSA.withDraw(1500);
//        }catch (InsufficientBalanceException e){
//            System.out.println(e.getMessage());
//        }
//        johnSA.(1000);
//        johnSA.deposit(2000);

    }

    public static void transcation(Account account, double amount) throws InsufficientBalanceException{
//        account.deposit(amount);
        account.withDraw(amount);

    }
}
