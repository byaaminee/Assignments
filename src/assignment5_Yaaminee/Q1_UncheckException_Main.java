package assignment5_Yaaminee;

import java.util.Scanner;

public class Q1_UncheckException_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		try {
		
			System.out.println("Divide the given number by zero...");
			int result = num/0;
			System.out.println("The result is: " + result);
		}
		
		catch(ArithmeticException e1) {
			System.out.println("Error message of dividing by zero is : " + e1 + "\n");	
		}
		
		try {
			int a[] = null;
			int len = a.length;
			System.out.println("Length of a given array is: " + len);
		}
		
		catch(NullPointerException e2) {
			System.out.println("Error message while finding the length of a null array is : " + e2 + "\n");
		}
		
		
		try {
			int arr[] = {1,2,26,2,6};
			System.out.println("Array length is: " + arr.length + " and try to access the index " + (arr.length) + " of the array!!");
			System.out.println("Access the index " + arr.length + " of the array " + arr[arr.length] );
			System.out.println("Printing the next line....!!!!");
		}
		
		catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Error message while access the index out of bound of the Array is: " + e3+ "\n");	
		}
					
			
		finally{
			scanner.close();
			System.out.println("This is finally block code. Scanner object is closed.");
			System.out.println("The end ****");
		}
		
		System.out.println("This is a statement after the finally block");
		
	}

}
