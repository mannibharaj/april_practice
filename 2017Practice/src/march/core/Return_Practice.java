package march.core;
import java.util.Scanner;

public class Return_Practice {
	
	public static int add(int x, int y){
		
		int solution = (x + y);
		
		return solution;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Enter your first number here: ");
		x = scan.nextInt();
		
		System.out.println("Enter your second number here: ");
		y = scan.nextInt();
		
		int solution = add(x, y);
		
		System.out.println("The addtion of both of these numbers is: " + solution);
		
	}

}
