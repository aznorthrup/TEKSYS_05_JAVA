package softwareDeveloperClubProjects;

import java.util.Scanner;

public class ClubMemberApp {
	public static void main(String[] args) {
		boolean browsing = true;
		Scanner selectionScreen = new Scanner(System.in);
		String fileName = "C:\\Users\\1997b\\OneDrive\\Desktop\\Homework\\javaProjects\\softwareDeveloperClubProjects\\src\\members.txt";
		SoftwareDeveloperClub one = new SoftwareDeveloperClub(fileName);
		while (browsing == true) {
			System.out.println("Select from the following menu:\n1. Display Members\n2. Remove Member\n3. Add Member\n4. Quit");
			int choice = selectionScreen.nextInt();
			if (choice == 1) {
				System.out.print(one.toString());
			}else if (choice == 2) {
				System.out.println("Please enter persons name:");
				String deleter = selectionScreen.nextLine();
				
			}else if (choice == 3) {
				System.out.println("Adder");
			}else {
				browsing = false;
			}
			
		}
		
	}

}
