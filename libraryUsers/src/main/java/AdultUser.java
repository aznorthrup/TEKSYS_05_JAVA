package main.java;

public class AdultUser implements LibraryUser{
	int age;
	String bookType;

	public void registerAccount() {
		if (age > 12) {
			System.out.println("You have successfully created an adult Account!");
		}else if (age < 12) {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}
	}

	public void requestBook() {
		if (bookType == "Fiction") {
			System.out.println("Book issued successfully, please return the book within 7 days!");
		}else if (bookType != "Fiction") {
			System.out.println("Oops, you're allowed to take only adult fiction books");
		}
	}
}
