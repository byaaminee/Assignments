package assignment3_Yaaminee;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListPracticedMain {

	public static void main(String[] args) {
		// Now, create objects from Student class stu1, stu2 etc. Then call Student class methods. This one I have just practiced the arrayList for the given question.​

		
		//Created an arraylist for the class Student
		ArrayList<Student> ary = new ArrayList<Student>();
		
				
		int stud_id = 0;
		String studName = "a";
		int sub1 = 0;
		int sub2 = 0;
		int sub3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int count = scanner.nextInt();
		
		
				for (int i = 0; i<count; i++) {
					
				//Create new object for each student	
				Student stu1 = new Student();
				System.out.println("Enter the student Id (Should be positive integer) for student #" + (i+1) + ": ");
				
				do {
					stud_id = scanner.nextInt();
					
					if (stud_id < 1)
						System.out.println("Please enter a positive integer value..");
					
				}while (stud_id<1);
				
				scanner.nextLine();
				System.out.println("Enter the student Name: ");
				studName = scanner.nextLine();
				stu1.getStuData(stud_id, studName);
				System.out.println("Enter the marks for all 3 subjects: ");
				
				do {
					sub1 = scanner.nextInt();
					if (sub1 < 0)
						System.out.println("Marks should be >= 0!!!!!!.. Please enter again!!!!!");
				} while (sub1<0);
				
				do {
					sub2 = scanner.nextInt();
					if (sub2 < 0)
						System.out.println("Marks should be >= 0!!!!!!.. Please enter again!!!!!");
				} while (sub2<0);
				
				do {
					sub3 = scanner.nextInt();
					if (sub3 < 0)
						System.out.println("Marks should be >= 0!!!!!!.. Please enter again!!!!!");
				} while (sub3<0);
				
				
				stu1.getStuMarks(sub1, sub2, sub3);
				System.out.println("-----------------------------------------------");
								
				//add the object to the array list. For the next loop it will automatically add the object to the next index of the arraylist.
				ary.add(stu1);
				
				}
				
				System.out.println("Size of the array list created: "+ ary.size());
		
		scanner.close();		
				
		System.out.println("Student details and total marks of each student");
		System.out.println("-----------------------------------------------");
				
		for (int i = 0; i < count; i++) {	
		ary.get(i).totalMarks();		
		}
	}

}
