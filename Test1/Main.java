package Test1;

public class Main {
    public static void doprint(First o){
        o.print();
    }
    public static void main(String[] args) {
        First x = new First();
        First y = new Second();
        Second z = new Second();
        doprint(x);
        doprint(y);
        doprint(z);
    }
}
