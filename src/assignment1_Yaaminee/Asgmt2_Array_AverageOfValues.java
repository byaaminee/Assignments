package assignment1_Yaaminee;

public class Asgmt2_Array_AverageOfValues {

	public static void main(String[] args) {

		//Question: Write a Java program to calculate average of values of an array.​
		
		int[] array = {1,2,3,4,8,9,14}; 
		
		int size = array.length;
		
		int sum = 0;
		
		int average=0;
		
		for (int i = 0; i<size; i++) {
			sum = sum + array[i];
		}
		
		average = sum/size;
		
		System.out.println("Array: {1,2,3,4,8,9,14}");
		System.out.println("Average of values given in the array is: " + average);
		
	}

}
