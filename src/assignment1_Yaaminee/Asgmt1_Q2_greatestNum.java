package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q2_greatestNum {

	public static void main(String[] args) {
		
		//Question: Write a Java program to find greatest of 3 numbers.​
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		scanner.close();
		
		if ((num1> num2) && (num1> num3)) {
			System.out.println("The greatest of 3 numbers entered is: " + num1);
		}
			
		else if ((num2> num1) && (num2> num3)) {
			System.out.println("The greatest of 3 numbers entered is: " + num2);
		}	
		
		else
			System.out.println("The greatest of 3 numbers entered is: " + num3);

	}

}
