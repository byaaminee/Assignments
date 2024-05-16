package assignment1_Yaaminee;

public class Asgmt2_Array_GreatestSmallest {

	public static void main(String[] args) {
		// Question: Write a program to find greatest and smallest element in an array.​
		
		int [] array = {1,2,3,4,8,9,14};
		
		int size = array.length;
		
		int greatest = array[0];
		int smallest = array[0];
		
		for (int i=0; i<size ; i++ ) {
			if (array[i] > greatest)
				greatest = array[i];
			
			if (array[i] < smallest)
				smallest = array[i];
				
		}

		System.out.println("Greatest Value in the given array is: " + greatest);
		System.out.println("Smallest Value in the given array is: " + smallest);
		
	}

}
