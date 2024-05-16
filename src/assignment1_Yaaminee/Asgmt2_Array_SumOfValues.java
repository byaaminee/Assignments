package assignment1_Yaaminee;

public class Asgmt2_Array_SumOfValues {

	public static void main(String[] args) {
		
		//Question: Write a Java program to calculate sum values of an array.​
		
		int[] array = {1,2,3,4,8,9,14};
		
		int sum = 0;
		
		int size = array.length;
		
		for (int i = 0; i<size ; i++) {
			
			sum = sum + array[i];
			
		}
		
		System.out.println("Array: {1,2,3,4,8,9,14}");
		System.out.println("Sum values of the given array is: " + sum);
		

	}

}
