package assignment5_Yaaminee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2_CheckedException {
	
	// Question 2: Write a java program to throw any checked exception using throw. Use the concept of
	//throws i.e., handle the exception in a different method/part of the class

	public static void readAtextFile(File file) throws FileNotFoundException {
		Scanner scanner2 = new Scanner(file);
		String printtext = scanner2.nextLine();
		System.out.println(printtext);
		scanner2.close();
	}
	
	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		String name = scanner.nextLine();
		Thread.sleep(1000);
		System.out.println("User enterned name is: " + name);
		
		//File file = new File("C:\\Users\\byaam\\OneDrive\\Desktop\\BusyQA\\Temp\\Test.txt");
		File file = new File("Test.txt");
		
		
		try {
			readAtextFile(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Statement after exception found");
		scanner.close();
		
	}

}
