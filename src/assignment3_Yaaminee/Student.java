package assignment3_Yaaminee;

public class Student {

	int SID;
	String Sname;
	int Sub1, Sub2, Sub3;
	
	void getStuData (int sid, String sname){
		this.SID = sid;
		this.Sname = sname;
	}	
	
	void getStuMarks (int s1, int s2, int s3) {
		this.Sub1 = s1;
		this.Sub2 = s2;
		this.Sub3 = s3;
	}
	
	void totalMarks () {
		int tot = Sub1 + Sub2 + Sub3;
		System.out.println("Student ID: " + SID);
		System.out.println("Student Name: " + Sname);
		System.out.println("Total marks of all 3 subjects: " + tot + "\n");	
	}
	
}
