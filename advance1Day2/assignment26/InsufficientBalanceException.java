package advance1Day2.assignment26;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(){
        super("Sufficient Balance not available");
    }
}
