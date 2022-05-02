package softwareDeveloperClubProjects;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
	public SoftwareDeveloperClub(String file) {
	String path = file;
	try {
		File memberFile = new File(path);
		Scanner input = new Scanner(memberFile);
		ArrayList<ClubMember> data = new ArrayList<>();
		
		while (input.hasNextLine()) {
			String[] line = input.nextLine().split("\\*\\*");
			data.add(new ClubMember(line[0], line[1], line[2], line[3]));
		}
		data.remove(0);
		for(ClubMember c : data ) {
			System.out.format("Name: %s \nLocation: %s, %s \nFavorite Language: %s\n\n", c.getName(), c.getCity(), c.getState(), c.getFavoriteLanguage());
		}
		input.close();
		}catch(FileNotFoundException e) {
			System.out.println("No file present");
			e.printStackTrace();
		}
	
		
		
	}
	
	public String toString() {
		return null;
			
	}

}

// String goingIn = "newFile.csv";
//
//try {
//File file = new File(goingIn);
//Scanner input = new Scanner(file);
//ArrayList<Course> data = new ArrayList<>();
//
//while (input.hasNextLine()) {
//	String[] line = input.nextLine().split(", ");
//	data.add(new Course(line[0], line[1], line[2]));
//	for(Course c : data ) {
//		System.out.format("%-15s | %-35s | %-25s\n", c.getCode(), c.getName(), c.getInstructor());
//	}
//}input.close();
//}catch(FileNotFoundException e) {
//	System.out.println("No file present");
//	e.printStackTrace();
//}

//InputStreamReader streamIn = null;
//
//try {
//	streamIn = new InputStreamReader(System.in);
//	System.out.println("Enter Q to quit");
//	
//	char Q;
//	
//	do {
//		Q = (char)streamIn.read();
//		System.out.println(Q);
//	}while(Q != 'Q');
//}finally {
//	if (streamIn != null) {
//		streamIn.close();
//	}
//	
//}


//try {
//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("What is your name?");
//	String name = reader.readLine();
//	
//	System.out.println("What is your job?");
//	String job = reader.readLine();
//	
//	System.out.println("What is your age?");
//	String age = reader.readLine();
//	int ageNum = Integer.parseInt(age);
//	String ageOut;
//	if (ageNum < 18) {
//		ageOut = "Child";
//	}else {
//		ageOut = "Adult";
//	}
//	
//	System.out.format("%s, %s, %s", name, job, ageOut);
//	reader.close();
//}catch(IOException e) {
//	System.out.println("That didn't work");
//	e.printStackTrace();
//}