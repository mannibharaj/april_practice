package march.core;

public class MultiDimen_Array_Practice {

	public static void main(String[] args) {

		String [] [] names = { {"Manni", "Loveleen", "Hardeep"}, {"Bharaj", "Birdi", "Birdi"}};
		// first bracket is [0] and second bracket is [1]. First name in first bracket is [0][0]
		System.out.println("The First Full Name is: " + names [0][0] +" "+ names[1][0]);
		System.out.println("The Second Full Name is: " + names [0][1] +" "+ names[1][1]);
		System.out.println("The Third Full Name is: " + names [0][2] +" "+ names[1][2]);
	}

}
