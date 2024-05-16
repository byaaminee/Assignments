package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q1_PostiveNegativeNum {

	public static void main(String[] args) {
		
		//Question: Write a Java program to get a number from the user and print whether it is positive or negative​
		
		Scanner scanner123 = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		
		double num = scanner123.nextDouble();
		
		scanner123.close();
		
		if (num > 0)
			System.out.println(num+ " is a Positive Number");
		
		else if (num == 0)
			System.out.println(num+ " is neither positive nor negative");
		
		else
			System.out.println(num+ " is a Negative Number");

	}

}
