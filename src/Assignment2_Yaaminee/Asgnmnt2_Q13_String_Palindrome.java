package Assignment2_Yaaminee;

import java.util.Scanner;

public class Asgnmnt2_Q13_String_Palindrome {

	public static void main(String[] args) {
		// Question: Write a program to check a string is palindrome or not​ (e.g., reverse of "level"; is "level")
		
		//String str1 = "level";
		String reversedStr = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String to validate Palindrome or NOT!!!");
		String str = scanner.nextLine();
		
		//System.out.println("String : " + str1);
		scanner.close();
		
		String str1 = str.replaceAll("\\S+", ""); //Since palindrome is a word or phrase that reads the same backward as forward I removed all the spaces
		
		int strLength = str1.length();
		
		for (int i = strLength-1 ; i>=0 ; i--) {
			reversedStr = reversedStr + str1.charAt(i);
			
		}
		
		if(str1.compareToIgnoreCase(reversedStr) == 0) {
			System.out.println("The string is Palindrome");
		}
		
		else {
			System.out.println("The string is NOT Palindrome");
		}
		
		//Test Data::: Sample Palindrome sentences used for testing
		//Level
		//Was it a cat I saw
		//Step on no pets
		//Don't nod
		//mom
		//madam
		
	}

}
