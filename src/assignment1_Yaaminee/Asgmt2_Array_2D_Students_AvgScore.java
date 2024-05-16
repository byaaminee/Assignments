package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt2_Array_2D_Students_AvgScore {

	public static void main(String[] args) {
		
		
		//Question: Write a Java program to find the average score of two students in three papers using 2-dimensional array.
		
		
		/*Test Data
		 rows = 2
		 columns = 4
		*/
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the number of rows of array (#of Students): ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns of array {Count should be (1 column for Student# + Number of Subjects)}: ");
		int columns = scanner.nextInt();
		
		int [][] array = new int [rows][columns];
		
		int j = 0;
		
		for (int i=0; i<rows ; i++) {
			
			System.out.println("Enter student Number: ");
			array[i][j] = scanner.nextInt(); //
			System.out.println("Enter the marks for " + (columns-1) + " subjects for the above student:");
			for (int k=1 ; k<columns ; k++) {
				array[i][k] = scanner.nextInt();
				
				if(array[i][k]<0) {
					System.out.println("Invalid Marks. Please enter the valid marks again!!!!!");
					array[i][k] = scanner.nextInt();
				}
			}			
		}
		
		scanner.close();
		
		System.out.println("Average Marks for each student...........");
		
		j= 0;
		int tot = 0;
		double average = 0;
		//DecimalFormat df = new DecimalFormal("#.00");
		
		for (int i=0; i<rows; i++) {
			System.out.print("Student#: " +array[i][j] + "\t" + "\t" );
			
			for (int k=1; k<columns; k++) {
				tot = tot + array[i][k];
			}
			
			average = tot/(columns-1);
			System.out.println("Average = " + average);
			tot = 0;
		}
			
	}

}
