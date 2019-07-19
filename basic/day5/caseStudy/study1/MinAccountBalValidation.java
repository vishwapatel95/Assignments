package basic.day5.caseStudy.study1;

public class MinAccountBalValidation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccAmount(5000);

        if (account.getAccAmount() < 500){
            System.out.println("The balance is below minimum");
        }else{
            System.out.println(account.getAccAmount());
        }
    }

}
