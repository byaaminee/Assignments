package Assignment2_Yaaminee;

public class Asgnmnt2_Q12_RemoveWhiteSpaces {

	public static void main(String[] args) {
		// Question: Write a Java program to remove white spaces in a string.​

		String str = "   Welcome  Yaaminee		to the  		AUTOMATION 	" + "	Class" + "\n" + "Added new line too !!!!";
		String strRemovedSpaces = str.replaceAll("\\s+","");
		
		System.out.println("String before removing white spaces: " + "\n" + str + "\n" + "\n");
		System.out.println("String after removing white spaces: " + "\n" + strRemovedSpaces);
		
	}

}
