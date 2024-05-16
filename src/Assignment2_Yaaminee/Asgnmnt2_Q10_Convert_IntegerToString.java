package assignment2_Yaaminee;

import java.util.Scanner;

public class Asgnmnt2_Q10_Convert_IntegerToString {

	public static void main(String[] args) {
		// Question: Write a Java program to convert integer to string.​
		
		System.out.println("Enter the integer value: ");
		
		Scanner scanner = new Scanner(System.in);
		int intNum = scanner.nextInt();
		scanner.close();
		
		String intConvertedToString = String.valueOf(intNum);
		
		System.out.println("Integer Value after converted to String is: " + intConvertedToString + "\n");
		
		System.out.println("Results after adding 10 to the converted value is : " + (intConvertedToString + 10));
			
	}

}