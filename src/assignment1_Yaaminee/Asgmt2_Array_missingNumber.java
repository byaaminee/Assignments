package assignment1_Yaaminee;

public class Asgmt2_Array_missingNumber {

	public static void main(String[] args) {
		// Question: Write a Java program to find missing number in an array.​ (Remove one number from the given array)

		int [] array = {1,2,3,4,8,9,14};

		int size = array.length;
		
		int total = 0;
		
		//Display the array and calculate the total
		for (int i=0; i<size; i++) {
			
			System.out.print(array[i]+ ", ");
			total=total + array[i];
		}
		
		System.out.println();
		
		//remove value from 3rd index;
		array[4]=0;
		
		System.out.println("Removed the 5th number from the list");
		
		//Find the missing number;
		
		int temp_tot = 0;
		for (int i=0; i<size; i++) {
			temp_tot = temp_tot + array[i];
		}
		
		int missing_val = total - temp_tot;
		
		System.out.println("Missing value is: " + missing_val);
	}

}
