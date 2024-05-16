package assignment2_Yaaminee;

public class Asgnmnt2_9_CountWords {

	public static void main(String[] args) {
		// Question: Write a Java program to count number of words in a sentence.

		String str = "   Welcome    Students'   to the Automation Testing Program a !!A001!!! 66 ****";
		
		String trimedStr = str.trim();
		int count = 0;
		
		String nStr = trimedStr.replaceAll("\\s+", " ");
		System.out.println(nStr);
		
		String [] result = nStr.split("\\s");
		
		for (int i = 0; i< result.length; i++) {

			if (!result[i].matches(".*[A-Za-z]+.*")) {
				System.out.println(result[i] + " : Since No letters this is not considered as a word");
				continue;
			}	
			
			System.out.println(result[i]);
			count = count + 1;
		}
		
		System.out.println("Number of words in the above sentence is: " + count);
		
	}

}
