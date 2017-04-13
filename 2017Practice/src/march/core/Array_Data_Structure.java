package march.core;

public class Array_Data_Structure {

	public static void main(String[] args) {
		
		// one way of making a array
		int [] firstArray = {5,3,0,1};
		
		
		// another way of making an array
		
		/* int [] secondArray = new int[500];
		 * 
		 * secondArray[0] = 5;
		 * secondArray[1] = 1;
		 * secondArray[2] = 0;
		 * secondArray[3] = 3;
		 * etc etc etc...
		 * but since our secondArray can hold 500 items, quick way to fill is
		 * 
		 * for loop......
		 * 
		 * for(int swag = 0; swag < 500; swag++) {
		 * secondArray[swag] = swag;
		 * }
		 */
		
		
		System.out.println("Loop Print");
		// how to print a array
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
		// another way of printing an array
		for(int number: firstArray) {
			System.out.println(number);
		}
		
		
	}
}
