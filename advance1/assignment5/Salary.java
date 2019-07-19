package advance1.assignment5;

public class Salary extends Account {
    final double minBalance = 10000;
    final boolean chequeBook = false;
    final boolean discountDebit = false;
    final boolean atmCard = true;

    public Salary(String fname, String lastName, String emailId, String accountType, String dateOfBirth, char gender, char maritialStatus) {
        super(fname, lastName, emailId, accountType, dateOfBirth, gender, maritialStatus);
    }

    public double getMinBalance() {
        return minBalance;
    }

    public boolean isChequeBook() {
        return chequeBook;
    }

    public boolean isDiscountDebit() {
        return discountDebit;
    }

    public boolean isAtmCard() {
        return atmCard;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Min balance should be : " +minBalance + "\n"+
                            "Cheque book : " + chequeBook +"\n" +
                            "Discount on debit card : " + discountDebit + "\n" +
                            "ATM Card : " + atmCard);

    }
}

