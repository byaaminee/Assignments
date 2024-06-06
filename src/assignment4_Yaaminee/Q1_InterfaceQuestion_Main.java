package assignment4_Yaaminee;

public class Q1_InterfaceQuestion_Main {

	public static void main(String[] args) {
//		Question
//		1. Write a program to demonstrate interface.​
//		Interface A : int a, int b sum()​
//		Class B : Implements method from A and calculate sum of a and b​

		
		Q1_ClassB o1 = new Q1_ClassB();
		
		int total = o1.sum();
		
		System.out.println("Sum of " +  Q1_ClassB.a + " & " + Q1_ClassB.b + " is " + total);
	}
}
