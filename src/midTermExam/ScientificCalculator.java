package midTermExam;

public class ScientificCalculator extends Calculator {
	
	public void square(double num) {
		double result = num * num;
		System.out.println("Square of a given number " + num + " is " + result);
	}
	
	public void cube(double num) {
		double result = num * num * num;
		System.out.println("Cube of a given number " + num + " is " + result);
	}

}
