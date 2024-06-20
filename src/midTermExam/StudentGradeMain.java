package midTermExam;

public class StudentGradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentGrades stud = new StudentGrades();
		stud.addGrade("John", 50.0d);
		stud.addGrade("Lane", 75.0d);
		stud.addGrade("Mona", 69.0d);
		stud.addGrade("Rocky", 90.0d);
		
		
		System.out.println("Grade of Mona is " + stud.getGrade("Mona") );
		
		System.out.println("Remove Lane from list!!");
		stud.removeStudent("Lane");
		
		stud.printAllGrades();
	}

}
