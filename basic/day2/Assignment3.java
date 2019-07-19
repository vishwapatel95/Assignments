package basic.day2;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade = 'A';

		
//		System.out.println("Enter Grade");
//		grade = scanner.next().charAt(0);
		
		switch(grade) {
		case 'A' :
			System.out.println("Your range of marks are between 80 to 100");
			break;
		case 'B':
			System.out.println("Your range of marks are between 73 to 79");
			break;
		case 'C':
			System.out.println("Your range of marks are between 65 to 72");
			break;
		case 'D':
			System.out.println("Your range of marks are between 55 to 64 ");
			break;
		case 'E':
			System.out.println("Your range of marks are less than 55");
			break;
		default :
			System.out.println("Grades does not exist");
			break;
		}
		
	}
}
