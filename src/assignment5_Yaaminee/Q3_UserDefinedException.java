package assignment5_Yaaminee;

import java.util.Scanner;

public class Q3_UserDefinedException {

	public static void main(String[] args) {
		// Question 3: Create user defined exception and use throw in it.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Student Name: ");
		scanner.nextLine();
		int marks = 0;
		
		System.out.println("Enter the marks for the Subject A (0 <=  Marks <=100): ");
		marks = scanner.nextInt();
		scanner.nextLine();
			
		try {
			if (marks<0 || marks >100) {
				throw new MyException("Record cannot be added since marks is not in the given range 0 <=  Marks <=100");
			}
				
			System.out.println("Student details will be added to the record. Thank you!");
		}	
		
		catch (MyException e){
			System.out.println(e);
		}
		
		finally {
			scanner.close();
			System.out.println("Scanner object is closed");
		}
	}
		
}

	class MyException extends Exception {
		
		private static final long serialVersionUID = 1L;
		
		public MyException() {
			super();
		}
		
		public MyException(String message) {
			super(message);
		}
		
	}
	

