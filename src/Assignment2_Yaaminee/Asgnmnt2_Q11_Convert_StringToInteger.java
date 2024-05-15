package Assignment2_Yaaminee;

import java.util.Scanner;

public class Asgnmnt2_Q11_Convert_StringToInteger {

	public static void main(String[] args) {
		// Question: Write a java program to compare two strings, ignoring case differences.​

		System.out.println("Enter the String value (Digits only) to be converted to Integer: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int result = 0;
		int converTOInt = 0;
		scanner.close();
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) == false) {
				//System.out.println("String contains characters other than digits. Please enter a valid number!!");
				result = 1;
				break;
			}
		}
		
		if (result == 0) {
			converTOInt = Integer.parseInt(str);
			System.out.println("Value after converted to Integer: " + converTOInt + "\n");
			System.out.println("Results after adding 10 to the converted value is : " + (converTOInt + 10));
		}
		
		else
			System.out.println("String contains characters other than digits. Next time please enter a valid number!!");
	}

}
