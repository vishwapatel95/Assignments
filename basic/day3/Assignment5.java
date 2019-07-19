package basic.day3;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();

        System.out.println("Length of the name is : " + name.length());
        System.out.println("Hi " + name);
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);
        String uppeNam =  name.toUpperCase();
        System.out.println(uppeNam);

        boolean value = name.startsWith("a");
        System.out.println(value);
        name = "KRISHNA";
        System.out.println(name);
    }
}
