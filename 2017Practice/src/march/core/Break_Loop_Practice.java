package march.core;

public class Break_Loop_Practice {

	public static void main(String[] args) {

		int x, y;
		loop:
			for (x = 0; x < 5; x++) {
				System.out.println(" ");
				for (y = 0; y < 5; y++) {
					System.out.print("x ");;
					if (y == 3 && x==2) {
						break loop;
						
					}
					
				}
				
			}
	}

}
