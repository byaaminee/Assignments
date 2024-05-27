package assignment3_Yaaminee;

public class CalculationsMain_Part2 {
	
	public static void main (String args []) {
	
		//Part2 Question: Now, create object for Calculations class ‘cal’ then call different methods by passing different
		//inputs.​
	
		
		Calculations_Part2 cal = new Calculations_Part2();
	
		System.out.println("Sum of 2 integer values: " + cal.sum(40, 50) );
		System.out.println("Sum of 3 integer values: " + cal.sum(10, 20, 30) );
		System.out.println("Sum of 2 double values: " + cal.sum(10d, 23.6d) );
		System.out.println("Sum of 3 double values: " + cal.sum(1000d, 5.2d, 20d) );

	}

}
