package advance1Day2.assignment18;

public class Hippo extends Animal{
    private int size;

    public Hippo(String name, int age, String color, int size) {
        super(name, age, color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
