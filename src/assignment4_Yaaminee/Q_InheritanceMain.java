package assignment4_Yaaminee;

public class Q_InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question: Create class for Teacher and another class ‘ComputerTeacher’ which extends ‘Teacher’ class then create objects then
		//call methods.​
	
		Q_Inheritance_Teacher tch = new Q_Inheritance_Teacher();
		Q_Inheritance_ComputerTeacher ctch = new Q_Inheritance_ComputerTeacher();
		
		System.out.println("Print details of Teacher object..");
		tch.getVariables();
		System.out.print("Does: ");
		tch.does();
		
		System.out.println("\n" + "------------------------------------------");
		System.out.println("------------------------------------------");
		
		System.out.println("Print details of Computer Teacher object..");
		ctch.getVariables();
		System.out.print("Does: ");
		ctch.does();
		
	}

}
