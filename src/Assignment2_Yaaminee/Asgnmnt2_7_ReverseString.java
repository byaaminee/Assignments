package assignment2_Yaaminee;

public class Asgnmnt2_7_ReverseString {

	public static void main(String[] args) {
		// Question: Write a Java program to reverse a string.​
		
		String str = "Hello World!";
		System.out.println("String before reverse: "+ "\n" +  str + "\n");
		
		String strReversed = "";
		
		int length = str.length();
		
		for (int i = length-1 ; i>= 0 ; i--) {
			
			strReversed = strReversed + str.charAt(i);
			//System.out.println(str.charAt(i));
		}

		System.out.println("After Reverse: " + "\n" + strReversed);
	}

}
