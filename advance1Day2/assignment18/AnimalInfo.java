package advance1Day2.assignment18;

public class AnimalInfo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tony",5,"White","GenrmenShephard",50);
        dog.displayInfo();

        System.out.println();
        Cat cat = new Cat("Mousy",3,"Brown","Mi-owww");
        cat.displayInfo();
    }
}
