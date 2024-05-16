package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q6_CountDigitsOfNumber {

	public static void main(String[] args) {
		// Question: Write a Java program count the number of digits of the number using while loop.​
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		int quo = num;
		
		int count = 0;
		
		while (quo != 0) {
			
			count = count + 1;
			
			quo = quo/10;			
		}
		
		System.out.println("Number of digits in the entered number " + num + " is: " + count);	
		
	}

}
