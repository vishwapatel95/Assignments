package basic.day4.selfReview;

public class SelfReview3 {
    public static void testClassMethod() {
        System.out.println("The class method in Animal.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal.");
    }
}
class Cat extends SelfReview3 {
    public static void testClassMethod() {
        System.out.println("The class method in Cat.");
    }
    public void testInstanceMethod() {

        System.out.println("The instance method in Cat.");
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        SelfReview3 myAnimal = myCat;
        SelfReview3.testClassMethod();
        myAnimal.testInstanceMethod();

    }
}
