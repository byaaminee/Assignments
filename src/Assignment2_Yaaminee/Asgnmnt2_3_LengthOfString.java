package Assignment2_Yaaminee;

import java.util.Scanner;

public class Asgnmnt2_3_LengthOfString {

	public static void main(String[] args) {
		// Question: Write a Java program to get the length of a given string
		
		String str1 = "QA Automation - April Batch";
		
		int strLength = str1.length();
		
		System.out.println("Length of Predefined String \"" + str1 + "\" is: " + strLength+ "\n");
		
		System.out.println("Enter the string to calculate the length: ");
		Scanner scanner = new Scanner(System.in);
		String strUser = scanner.nextLine();
		scanner.close();
		
		int strLength2 = strUser.length();
		System.out.println("Length of User defined String \"" + strUser + "\" is: " + strLength2+ "\n");
		
		

	}

}
