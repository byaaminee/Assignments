package assignment2_Yaaminee;

import java.util.Scanner;

public class Asgnmnt2_2_ConcatStrings {

	public static void main(String[] args) {
		// Question: Write a java program to concatenate a given string to the end of another string.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to concatenate to the existing string: ");
		String str = scanner.nextLine();
		scanner.close();
		
		
		String str1 = "JAVA Hello World " ;
		//String str2 = "Example";
		String str3 = str1.concat(str);
		System.out.println("\n" + "Strings to be concatenated are: " + "\n" + str1 + "\n" + str+ "\n" + "\n");
		System.out.println("Contenated String is: " + str3);
		

	}

}
