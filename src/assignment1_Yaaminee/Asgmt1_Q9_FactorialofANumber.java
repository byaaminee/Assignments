package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q9_FactorialofANumber {

	public static void main(String[] args) {
		// Question: Write a Java Program to print factorial of a given number using any loop.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		int count = num; // 2
		int result = 1;
		
		for (int i=count; i>0; --i) {
			result = result*i;
		}

		System.out.println("Factorial of " + num + " is: " + result);
		
	}

}
