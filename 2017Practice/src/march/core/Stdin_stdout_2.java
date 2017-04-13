package march.core;
import java.util.Scanner;

public class Stdin_stdout_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//	ANY INTEGER WILL BE ADDED TO i
		
		int i = scan.nextInt();
		
		//	IT WILL SCAN THE NEXT ENTRY, ADD ADD DOUBLE IF PERIOD IS INCLUDED LIKE 3.14.
		scan.nextLine();
		Double d = scan.nextDouble();
		
		//	IT WILL SCAN THE NEXT ENTRY, AND ADD STRING IF ALL CHARACTERS
		scan.nextLine();
		String s = scan.nextLine();
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
