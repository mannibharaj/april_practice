package march.core;
import java.util.Scanner;

public class HackerRank_Practice {

	public static void main(String[] args) {
		
//		GOAL: we finna call scanner to scan what we input and see how it goes 
//		DATE: Feb 2nd 2017
//				

		
		
//		here we are naming scan as the new scanner. And we are going to have system.in because we want to input fields.
		Scanner scan = new Scanner(System.in);
		
//		here we are saying to make a string to whichever we input from scanner class.
		String myString = scan.next();
		
//		here we are saying to make a int list from the scanner
		int myInt = scan.nextInt();
		
//		we are going to close the scanner
		scan.close();
		
//		we are going to print what we typed
		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
		
		

	
	}

}
