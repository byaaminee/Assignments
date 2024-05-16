package assignment1_Yaaminee;

public class Asgmt2_Array_duplicates {

	public static void main(String[] args) {
		
		//Question: Write a program to find duplicate elements in an array.​
		
		//int [] array = {1,1,2,2,3,4,8,9,14};
		
		int []array = {1,2,3,4,8,9,14};
		
		int size = array.length;
		
		int dupCount = 0;
		
		System.out.println("Duplicate elements in the given array are: ");
		
		for (int i=0; i<size; i++) {
			
			for (int j=i+1; j<size ; j++) {
				
				if (array[i] == array[j]) {
					System.out.print(array[i]+", ");
					dupCount++;
				}
				
			}	
			
		}
		
		if(dupCount==0) {
			System.out.println("There are NO duplicates");
		}
	}

}
