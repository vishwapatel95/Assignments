package basic.day2;

public class Assignment6 {
    String name;

    public Assignment6(String name) {
        this.name = name;
    }

    public Assignment6() {
    }

    public static void main(String[] args){
        Assignment6 userType1 = new Assignment6("Faculty");
        Assignment6 userType2 = new Assignment6();

        System.out.println(userType1.name);
        System.out.println(userType2.name);
    }
}
