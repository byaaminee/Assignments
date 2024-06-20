package midTermExam;

import java.util.Scanner;

public class CalculatorMainPartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScientificCalculator obj = new ScientificCalculator();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate square and cube: ");
		double num1 =  scanner.nextInt();
		obj.square(num1);
		obj.cube(num1);
		
		BasicCalculator obj2 = new BasicCalculator();
		int num3 = 2;
		int num4 = 6;
		obj2.addition(num3, num4);
		
	}

}
