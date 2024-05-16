package assignment1_Yaaminee;

public class Asmgt2_Array_2D_Matrices_Addition {

	public static void main(String[] args) {
		
				
		//Question: Add two matrices using 2-dimensional array
		
		int [][] matrix1 = {{9,6,5}, {2,6,1},{5,4,3}};
		int [][] matrix2 = {{2,8,5},{3,6,9},{1,10,12}};
		
		int [][] matrix3 = new int [3][3];
		
		
		//System.out.println("Enter values for 2D Matrix1: ");
		//System.out.println("Enter values for 2D Matrix2: " );

		
		//matrix1.
		
		System.out.println("Matrix1");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++ ) {
				System.out.print(matrix1[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		for (int k=0; k<100 ; k++)
		System.out.print("*");
		System.out.println();
		
		//matrix2
		System.out.println("Matrix2");
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++ ) {
						System.out.print(matrix2[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
				
				for (int k=0; k<100 ; k++)
				System.out.print("*");
				System.out.println();
		
		//matrix3 : Addition of matrix1, matrix2
		System.out.println("Addtion of Matrix1, Matrix2");		
				
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++ ) {
						
						matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
						System.out.print(matrix3[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
				
				for (int k=0; k<100 ; k++)
				System.out.print("*");
		
			
	}

}
