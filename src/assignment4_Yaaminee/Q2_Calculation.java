package assignment4_Yaaminee;

public class Q2_Calculation implements Q2_InterfaceA, Q2_InterfaceB {

	@Override
	public void add() {
		System.out.println("Addition of Interface A variables " + a + ", "+ b + " = " + (a+b));
		}
	
	@Override
	public void mul() {
		System.out.println("Multiplication of Interface B variables: " + x +", " + y + " = " + (x*y));
	}

}
