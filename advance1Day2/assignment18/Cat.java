package advance1Day2.assignment18;

public class Cat extends Animal implements PetAnimal {
    private String sound;

    public Cat(String name, int age, String color, String sound) {
        super(name, age, color);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean beingFriendly() {
        return false;
    }

    @Override
    public boolean playingWithHuman() {
        return false;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sound : " + sound + "\n" +
                "Being Friendly : " + beingFriendly() + "\n" +
                "Playing with humans : " + playingWithHuman());
    }
}
