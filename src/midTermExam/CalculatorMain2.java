package midTermExam;

import java.util.Scanner;

public class CalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		double num1= scanner.nextDouble();
		double num2= scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Select the operation Addition (+), Subtraction (-), Multiplication (*), or Division (/).");
		String operator = scanner.nextLine();

		
		try {
		
		if (operator!="+" || operator!="-" || operator!="*" || operator!="/") {
				
			Calculator cal = new Calculator();
			
			switch (operator) {
			case "+":
				cal.addition(num1, num2);
				break;
			case "-":
				cal.substraction(num1, num2);
				break;
			case "*":
				cal.multiplication(num1, num2);
				break;
			case "/":
				cal.division(num1, num2);
				break;
			default:
				try {
				throw new MyException("Please enter the valid operator sign as given in the instruction!!!");
				}
				catch(MyException e) {
					System.out.println(e);
				}
			}	
		}
		
		
		}
		
		catch(ArithmeticException e1) {
			System.out.println("Error message of dividing by zero is : " + e1 + "\n");	
		}
		
		
		finally {
			scanner.close();
		}
		
		
		
		
		
	}
	
}

//class MyException extends Exception {
//	
//	private static final long serialVersionUID = 1L;
//	
//	public MyException() {
//		super();
//	}
//	
//	public MyException(String message) {
//		super(message);
//	}
	

