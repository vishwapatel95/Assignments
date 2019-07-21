package advance2.assignment7;

public class WithdrawTransaction extends Security implements Runnable {
    private int transactionId;
    private Account account;
    private Customer customer;
    private double amount;

    public WithdrawTransaction(int transactionId, Account account, Customer customer, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.customer = customer;
        this.amount = amount;
    }

    public synchronized double withdraw(Account account, double amount) throws
            InsufficientBalanceException {
    //checking if the account has sufficient balance
        if (account.getBalance() >= amount) {
    //withdrawing the amount from the account
            account.setBalance(account.getBalance() - amount);
        } else {
    //throwing an exception if the balance is not
    //sufficient
            throw new InsufficientBalanceException();
        }
    //returning the balance
        return account.getBalance();
    }

    public synchronized void run() {
        try{
//checking if the customer is authorized to withdraw
//from the given account
            authorization(account, customer);
//withdrawing the amount after authorization
            double balance=withdraw(account, amount);
//displaying the success message
            System.out.println(transactionId+" transaction"+
                    "completed!!! and the balance amount is "
                    +balance);

        }catch(UnAuthorizedWithdrawTransactionException
                unAuthorizedWithdrawTransactionException){
//displaying an appropriate message if the customer is
//not authorized to do the transaction
            System.out.println(transactionId+" transaction "+
                    "failed!!! and "+
                    unAuthorizedWithdrawTransactionException.getMessage());
        }catch(InsufficientBalanceException

                insufficientBalanceException){

//display the error message for insufficient balance
            System.out.println(transactionId+" transaction "+"failed!!! and your account has insufficient"+ "balance");

        }
    }
}
