package assignment2_Yaaminee;

public class Asgnmnt2_8_CharRepeatedNumInStr {

	public static void main(String[] args) {
		//Question: Write a Java program to count number of time a character repeated in a string.​
		
	   // String str = "Welcome Students of Automation Testing Program";
	   
	   String str = "   Welcome!   Yaaminee to the AUTOMATION'24 BaTCH!!";
	   
	   String testingString = str.replaceAll("\\s+", " ");
	   
	   int count = 0;
	   
	   int strLength = 0;
	   
	   String testChar = "n";
	   
	   System.out.println ("String is : " + str + "\n");
	   
	   System.out.println("Number of times a character repeated in above string (Note: results is not case sensitive and spaces are ignored)" + "\n" + testingString);
	   
	   testingString = testingString.toLowerCase().replaceAll(" ", "");
	   
	   while(!testingString.isBlank()) {
		   
		   testChar = testingString.substring(0, 1);
		   
		   count = 1;
		   
		   strLength = testingString.length();
		   
		   for (int i = 1; i< strLength ; i++) {
			   
			   if ( testChar.equals(testingString.substring(i, i+1)) ) {
				   count = count + 1;
			   }  
		   }
		   
		   System.out.println(testChar + " ---> " + count);
		   
		   testingString = testingString.replaceAll(testChar, "");
		   //System.out.print(strLowerCase);
	   }
	   	   
		   

	}

}
