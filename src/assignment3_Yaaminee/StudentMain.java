package assignment3_Yaaminee;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// Part1 Question 1: Now, create objects from Student class stu1, stu2 etc. Then call Student class methods.
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		int stuID = 0;
		String stuName = "";
		int sub1, sub2, sub3 = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter student ID for student #" + ++count);		
		stuID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the student Name: ");
		stuName = scanner.nextLine();
		
		stu1.getStuData(stuID, stuName);
		
		System.out.println("Enter the marks for all 3 subjects: ");
		sub1 = scanner.nextInt();
		sub2 = scanner.nextInt();
		sub3 = scanner.nextInt();
		stu1.getStuMarks(sub1, sub2, sub3);
		
		System.out.println("***********************************");
		
		System.out.println("Enter student ID for student #" + ++count);
		stuID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter student Name");
		stuName = scanner.nextLine();
		stu2.getStuData(stuID, stuName);
		
		System.out.println("Enter the marks for all 3 subjects: ");
		sub1 = scanner.nextInt();
		sub2 = scanner.nextInt();
		sub3 = scanner.nextInt();
		stu2.getStuMarks(sub1, sub2, sub3);
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Student details and total marks of each student");
		System.out.println("-----------------------------------------------");
		
		stu1.totalMarks();
		stu2.totalMarks();
		
		scanner.close();
	}

}
