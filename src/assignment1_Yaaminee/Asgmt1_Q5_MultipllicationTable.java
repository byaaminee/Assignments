package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q5_MultipllicationTable {

	public static void main(String[] args) {
		// Write a Java to display the multiplication table of a given integer using for loop.​

		System.out.println(" Enter a number for the multiplication table ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		for (int i=1; i<=12; i++) {
			
			int mul = num * i;
			System.out.println(num + " x " + i + " = " + mul );
		}
		
	}

}
