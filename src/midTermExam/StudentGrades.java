package midTermExam;

import java.util.HashMap;

public class StudentGrades {
	
	HashMap<String,Double> map = new HashMap<>();
	
	StudentGrades(){
		
	}
	
	public void addGrade (String studentName, Double grade){
		
		map.put(studentName, grade);
		
	}

	public double getGrade(String studentName) {
		
		double result = map.get(studentName);
		
		return result;
		
	}
	
	public void removeStudent(String studentName) {
		map.remove(studentName);
		System.out.println("Removed the following student from the list: " + studentName);
	}
	
	public void printAllGrades() {
		System.out.println("All students details: " + "\n" + map);
	}

}
