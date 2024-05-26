package assignment3_Yaaminee;

import java.util.Scanner;

public class CalculationMain {

	public static void main(String[] args) {
		// Part1 Question2: Now, create object and call constructor by passing 3 integer values then call sum method.
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter 3 integer type numbers : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		scanner.close();
		
		Calculation c1 = new Calculation (n1,n2,n3);
		int tot = c1.sum();
		
		System.out.println("Sum of given numbers is: " + tot );

	}

}
