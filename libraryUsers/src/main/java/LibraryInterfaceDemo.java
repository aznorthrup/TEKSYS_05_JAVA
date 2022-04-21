package main.java;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		System.out.println("Test Case 1:");
		
		KidUser k1 = new KidUser();
		k1.age = 10;
		k1.registerAccount();
		KidUser k2 = new KidUser();
		k2.age = 18;
		k2.registerAccount();
		
		k1.bookType = "Kids";
		k1.requestBook();
		k2.bookType = "Fiction";
		k2.requestBook();
		
		System.out.println("Test Case 2:");
		
		AdultUser a1 = new AdultUser();
		a1.age = 5;
		a1.registerAccount();
		AdultUser a2 = new AdultUser();
		a2.age = 23;
		a2.registerAccount();
		
		a1.bookType = "Kids";
		a1.requestBook();
		a2.bookType = "Fiction";
		a2.requestBook();
	}

}
