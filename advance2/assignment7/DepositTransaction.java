package advance2.assignment7;

public class DepositTransaction extends Thread {
    private int transactionId;
    private Account account;
    private double amount;
    private int customerId;

    public DepositTransaction(int transactionId, Account account, int customerId, double amount){
        this.transactionId = transactionId;
        this.account = account;
        this.customerId = customerId;
        this.amount = amount;
    }

    public synchronized void deposit(Account account, double amount){
        //depositing the amount
        account.setBalance((account.getBalance()+amount));
    }

    public synchronized void run(){
    //depositing the amount
        deposit(account, amount);
    //displaying the success message
        System.out.println(transactionId+" transaction "+
                "completed!!!"+customerId +" thank you for "+
                "depositing to the Account "+account.getAccountNo());

    }
}
