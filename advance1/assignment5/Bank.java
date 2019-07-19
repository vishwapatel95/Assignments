package advance1.assignment5;

public class Bank {
    public static void main(String[] args) {
        Account account;

        String type = "Nonsalary";

        if (type.equalsIgnoreCase("Salary")){
            account = new Salary("John","Williams","dfsf@gasfs.com",type,"4/4/19",'M','S');
            account.setCusId(account.generateCusId());
            account.setAccountNumber(account.generateAccount());
            account.displayDetails();
        }else {
            account = new NonSalary("Vishwa","Patel","fsf@gsdf.com",type,"4.4.21",'M','S',100000);
            account.setCusId(account.generateCusId());
            account.setAccountNumber(account.generateAccount());
            account.displayDetails();
        }


    }

}
