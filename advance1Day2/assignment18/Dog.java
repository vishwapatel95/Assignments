package advance1Day2.assignment18;

public class Dog extends Animal implements PetAnimal {
    private String breed;
    private int walkSpeed;

    public Dog(String name, int age, String color, String breed, int walkSpeed) {
        super(name, age, color);
        this.breed = breed;
        this.walkSpeed = walkSpeed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    @Override
    public boolean beingFriendly() {
        return true;
    }

    @Override
    public boolean playingWithHuman() {
        return true;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed : " + breed + "\n" +
                            "Walk Speed : " + walkSpeed + "\n"+
                            "Being Friendly : " + beingFriendly() + "\n" +
                            "Playing with humans : " + playingWithHuman());
    }
}
