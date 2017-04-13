package march.core;
import java.util.Scanner;

public class If_Else_Example {

	public static void main(String[] args) {
		//	Input a value if its even or not
		Scanner scan = new Scanner(System.in);
		// we're saying n will be what we enter from scan
		int n = scan.nextInt();
		String ans = " ";
		// IF n IS DIVIDED BY 2 EQUALS, IS IT EVEN OR NOT?
		if (n % 2==1){
			ans = "Weird";
		}
		else{
			ans = "Not weird";
		}
		System.out.println(ans);
	}

}
