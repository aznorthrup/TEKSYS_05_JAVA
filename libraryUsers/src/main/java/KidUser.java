package main.java;

public class KidUser implements LibraryUser{
	int age;
	String bookType;
	@Override
	public void registerAccount() {
		if (age < 12) {
			System.out.println("You have successfully created a kids Account!");
		}else if (age > 12) {
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}
	}
	@Override
	public void requestBook() {
		if (bookType == "Kids") {
			System.out.println("Book issued successfully, please return the book within ten days!");
		}else if (bookType != "Kids") {
			System.out.println("Oops, you're allowed to take only kids books");
		}
	}
	
}
