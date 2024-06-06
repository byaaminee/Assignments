package assignment4_Yaaminee;

public class Q_Inheritance_ComputerTeacher extends Q_Inheritance_Teacher {

	private String department = "Computer";
	
	void does() {
		super.does();
		System.out.println(department);
	}
	
	void getVariables() {
		super.getVariables();
		System.out.println("Department: " + department);
	}
	
}
