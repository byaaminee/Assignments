package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q8_PalindromeNumber {

public static void main(String[] args) {
	
		/*Question: Write a Java program to check Number is Palindrome or not using while loop.​ (Reverse of 121 is 121,
		so it is palindrome)*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		int quo = num;
		
		int digits = 0;
		int mul=1;
		int rem = 0;
		int revNum = 0;
		
		//First find the digits of number
		while (quo != 0) {
			
			digits = digits + 1;
			
			quo = quo/10;			
		}
		
		//Display the number of digits of a given number
		System.out.println("Number of digits: " + digits);
		
		quo = num;
		
		System.out.println("Number before reverse: "+ quo);
		
		
		while (quo != 0) {// Ex: 1st loop 121 , 2nd loop 12, 3rd loop 1 **** 4th loop false and get exit
			
			//Power of 10
			for (int i=1; i<digits ; i++) { // digits = 3, i = 1,2 ***** 2nd loop digits = 2, i=1 *** 3rd loop digit = 1 since false will not enter for loop
				mul *= 10;				// 10*10  **** 2nd loop 10 
			}
			
			rem = quo%10; //1 *** 2nd loop 2 *** 3rd loop 1
			quo = quo/10; //12 **** 2nd loop 1 *** 3rd loop 0
			
			revNum = revNum + rem * mul; // 0+ 1*100 *** 2nd loop 100+ 2*10 = 120 *** 3rd loop 120+ 1*1
			digits = digits - 1; // 3-1 = 2 **** 2nd loop digits = 1 *** 3rd loop digits = 0
			mul = 1;
		}
		
		System.out.println("Reversed number of " + num + " is: " + revNum);	
		
		//Verify the numbers before and after reversal is same or not..
		
		if (num == revNum)
			System.out.println("Number entered by the user is Palindrome");
		
		else
			System.out.println("Number entered by the user is NOT Palindrome");
		
	}

}
