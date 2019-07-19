package advance1Day2.assignment25.com.exception;

public class CheckedException {
    public static void main(String arg[]) {
        try{
            Class.forName("com.exception.ExceptionDemo");
        }catch (ClassNotFoundException exception){
            System.out.println("Exception : " + exception);
        }
    }
}
