package advance1.assignment5;

import java.util.Random;

public class NonSalary extends Account {
    private double minBalance;
    final boolean chequeBook = false;
    final boolean discountCard = true;
    final boolean atmCard = true;

    public NonSalary(String fname, String lastName, String emailId, String accountType, String dateOfBirth, char gender, char maritialStatus, double minBalance) {
        super(fname, lastName, emailId, accountType, dateOfBirth, gender, maritialStatus);
        this.minBalance = minBalance;
    }


    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public boolean isChequeBook() {
        return chequeBook;
    }

    public boolean isDiscountCard() {
        return discountCard;
    }

    public boolean isAtmCard() {
        return atmCard;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Min balance should be : " +minBalance + "\n"+
                "Cheque book : " + chequeBook +"\n" +
                "Discount on debit card : " + discountCard + "\n" +
                "ATM Card : " + atmCard);
    }
}
