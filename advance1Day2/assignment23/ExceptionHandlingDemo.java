package advance1Day2.assignment23;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
//        String name = null;
//        try{
//            System.out.println(name.length());
//            System.out.println("End of try block");
//        }
//        catch(NullPointerException exception){
//            System.out.println("Object is null");
//        }
//        System.out.println("Continuing the execution...");

        String name = null;
        int total = 100,count=0;
        try{
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
        }
        catch(NullPointerException exception){
            System.out.println("Object is null");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception " + e.getMessage());
        }
        System.out.println("Continuing the execution...");
    }
}
