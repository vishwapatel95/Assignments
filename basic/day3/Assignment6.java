package basic.day3;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, iterations;
//        number = Integer.parseInt(args[0]);
//        iterations = Integer.parseInt(args[1]);

        System.out.println("Enter number for multiplication");
        number = scanner.nextInt();

        System.out.println("Enter the number of iterations");
        iterations = scanner.nextInt();

        for (int i = 1;i<=iterations;i++){
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}
