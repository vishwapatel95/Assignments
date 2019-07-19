package basic.day5.selfReview;

abstract class Animal {
    abstract void testClassMethod();
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal.");
    }
}
public class Cat extends Animal {
    public void testClassMethod() {
        System.out.println("The class method in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat.");
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
