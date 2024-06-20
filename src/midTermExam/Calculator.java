	package midTermExam;
	
	public class Calculator {
		
		
		public void addition(double num1, double num2) {
			double result = num1 + num2;
			System.out.println("Addition of given numbers: " + num1 + ", " + num2 + " = " +  result);
		}
	
		
		public void substraction(double num1, double num2) {
			double result = num1 - num2;
			System.out.println("Substraction of given numbers : " + num1 + ", " + num2 + " = " +  result);
			}
		
		public void multiplication (double num1, double num2) {
			double result = num1 * num2;
			System.out.println("Multiplication of given numbers: " + num1 + ", " + num2 + " = " +  result);
		}
		
		public void division (double num1, double num2) {
			double result = num1 / num2;
			System.out.println("Division of given numbers: " + num1 + ", " + num2 + " = " +  result);
		}
		
	}
