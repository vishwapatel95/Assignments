package advance1Day2.assignment8;

public class TestLoan {
    public static void main(String[] args) {
        Loan loan2 = Loan.getLoanInstance();
//        Loan loan2 = new Loan();
//
//        Loan loan4 = new Loan(1,231,423,1000,2,2);
//        Loan loan3 = new Loan(2,432,434,1000,5,4);

        System.out.println("Number of Instances : " + loan2.getNumberOfObjects());
    }
}
