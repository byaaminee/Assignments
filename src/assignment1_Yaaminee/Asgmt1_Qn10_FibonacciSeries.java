package assignment1_Yaaminee;

public class Asgmt1_Qn10_FibonacciSeries {

	public static void main(String[] args) {
		// Question: Write a program to print Fibonacci Series in the range of 1 to 50. Series: (1, 1, 2, 3, 5, 8, 13...).
			
		long last = 50;
		
		long num1 = 1;
		long num2 = 1;
		long num3 = 0;
		
		
		System.out.println("Fibonacci Series in the range of 1 to 50....");
		System.out.print(num1 + ", ");
		System.out.print(num2 + ", ");
		
		for (int i = 3; i<=last; i++) {
			
			num3 = num1+num2;
			System.out.print(num3 + ", ");
			num1=num2;
			num2=num3;
		}
		

	}

}
