package assignment1_Yaaminee;

public class Asgmt2_Array_OddEvenValues {
	
	public static void main (String [] args) {
		
		//Question: Write a Java program to print even and odd numbers in an array.​
		
		int [] array = {1,2,3,4,8,9,14};
		
		int size = array.length;
		
		
		for (int i = 0; i<size ; i++) {
			
			if ( array[i] % 2 == 0) {
				System.out.println("Array value " + array[i] + " is an EVEN number");
			}
			
			else {
				System.out.println("Array value " + array[i] + " is an ODD number");
			}
				
		}
		
	}

}
