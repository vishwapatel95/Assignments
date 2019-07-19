package advance1.assignment5;

import java.util.Random;

public class Account {
    private String fname;
    private String lastName;
    private String emailId;
    private String accountType;
    private String dateOfBirth;
    private char gender;
    private char maritialStatus;
    private int cusId;
    private int accountNumber;

    public Account(String fname, String lastName, String emailId, String accountType, String dateOfBirth, char gender, char maritialStatus) {
        this.fname = fname;
        this.lastName = lastName;
        this.emailId = emailId;
        this.accountType = accountType;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritialStatus = maritialStatus;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(char maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    public int generateCusId(){
        int i = new Random().nextInt(900000) + 100000;
        return i;
    }

    public int generateAccount(){
        int j = new Random().nextInt(900000) + 100000;
        return j;
    }

    public void displayDetails(){
        System.out.println("Customer Id : " + getCusId() + "\n" +
                            "Customer Name : " + getFname()+ getLastName() + "\n" +
                            "Customer Account Number : " + getAccountNumber() + "\n" +
                            "Customer email : " + getEmailId() + "\n " +
                            "Customer Type : " + getAccountType() + "\n" +
                            "Customer DOB : " + getDateOfBirth() + "\n" +
                            "Customer Gender : " + getGender() + "\n");
    }
}
