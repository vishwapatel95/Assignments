package Test;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Class abc = Class.forName("Test.Demo");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
