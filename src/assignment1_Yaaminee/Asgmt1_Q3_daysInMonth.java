package assignment1_Yaaminee;

import java.util.Scanner;

public class Asgmt1_Q3_daysInMonth {

	public static void main(String[] args) {
		// Question: Write a Java program to find the number of days in a month using switch case statement.​

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month: (Jan/Feb/Mar/Apr/May/Jun/Jul/Aug/Sep/Oct/Nov/Dec");
		
		String month = scanner.nextLine();
		
		scanner.close();
		
		int days = 0;
		
		switch(month) {
		
		case "Jan":
			days = 31;
			break;
			
		case "Feb":
			days = 28;
			System.out.print("In leap years number of days in a month of Feb is 29 where as in common years, ");
			break;
		
		case "Mar":
			days = 31;
			break;
			
		case "Apr":
			days = 30;
			break;
			
		case "May":
			days = 31;
			break;
			
		case "Jun":
			days = 30;
			break;
			
		case "Jul":
			days = 31;
			break;
			
		case "Aug":
			days = 31;
			break;
			
		case "Sep":
			days = 30;
			break;
			
		case "Oct":
			days = 31;
			break;
			
		case "Nov":
			days = 30;
			break;
			
		case "Dec":
			days = 31;
			break;	
		
		default:
			days=0;
			System.out.println("User entered invalid month. Please enter the valid month as shown in the list.");
			
		}
		
		if (days > 0) {
		System.out.println("Number of days in a month of " + month + " is: " + days);
		}
					
	}

}
