package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q4_LeapYear {

	public static void main(String[] args) {
		
		//Question: Write a Java program that takes a year from user and print whether that year is a leap year or not.​
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		int lyear_mod = year % 4;
		
		if (lyear_mod == 0) {
			System.out.println("Year: "+ year + " is a leap year");
		}
		
		else {
			System.out.println("Year: "+ year + " is NOT a leap year");
		}

	}

}
