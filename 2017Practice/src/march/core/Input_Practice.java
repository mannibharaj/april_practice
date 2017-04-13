package march.core;
import java.util.Scanner;

public class Input_Practice {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your grade between 0-100");
		
		int grade = scan.nextInt();
		
		
		if (grade == 100) {
			System.out.println(" you scored a perfect score man");
		}else if (grade >= 60) {
			System.out.println(" not so good");
		} else if (grade <60) {
			System.out.println(" fail");
		}
		
		
	
	}

}
