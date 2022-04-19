package main.java;

import java.util.Scanner; 

public class main {

	public static void main(String[] args) {
		int count = 0;
		count++;

		System.out.println("\nConditionals " + count + ":\n");
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		count++;

		System.out.print("\nConditionals " + count + ":\n");
		x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		count++;

		System.out.print("\nConditionals " + count + ":\n");
		x = 15;
		if (x<10) {
			System.out.println("Less than 10");
		}else if (x>=10 && x<20) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");
		}
		x = 50;
		if (x<10) {
			System.out.println("Less than 10");
		}else if (x>=10 && x<20) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");
		}
		count++;

		System.out.print("\nConditionals " + count + ":\n");
		x = 15;
		if (x<10 || x > 20) {
			System.out.println("Out of range");
		}else if (x>=10 && x<=20) {
			System.out.println("In range");
		}
		x = 5;
		if (x<10 || x > 20) {
			System.out.println("Out of range");
		}else if (x>=10 && x<=20) {
			System.out.println("In range");
		}
		count++;

		System.out.print("\nConditionals " + count + ":\n");
		Scanner myScore = new Scanner(System.in);
		System.out.println("Enter a number to calculate your grade!");
		int score = myScore.nextInt();
		if (score>=90) {
			System.out.println("A");
		}else if (score<90 && score >=80) {
			System.out.println("B");
		}else if (score<90 && score >=70) {
			System.out.println("C");
		}else if (score<90 && score >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		count++;

		System.out.print("\nConditionals " + count + ":\n");
		Scanner userNumber = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7");
		x = userNumber.nextInt();
		String ans;
		switch (x) {
		case 1:
			ans = "Monday";
			break;
		case 2:
			ans = "Tuesday";
			break;
		case 3:
			ans = "Wednesday";
			break;
		case 4:
			ans = "Thursday";
			break;
		case 5:
			ans = "Friday";
			break;
		case 6:
			ans = "Saturday";
			break;
		case 7:
			ans = "Sunday";
			break;
			default:
				ans = "Out of range";
		}System.out.println("Your number, "+x+", corresponds to "+ans);
		myScore.close();
		userNumber.close();
		
		count = 1;
		System.out.println("\nLoops " + count + ":\n");

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			continue;
		}
		count++;
		
		int subcount = 0;
		System.out.println("\nLoops " + count + ":\n");
		while (subcount < 101) {
			System.out.println(subcount);
			subcount += 10;
		}
		count++;
		
		subcount = 0;
		System.out.println("\nLoops " + count + ":\n");
		do {
			subcount++;
			System.out.println(subcount);
		} while (subcount < 10);
		count++;

		System.out.println("\nLoops " + count + ":\n");
		for (int i = 5; i < 101; i += 5) {
			if (i <= 25) {
				System.out.print(i);
				continue;
			} else if (i >= 75 && i <= 100) {
				System.out.println(i);
				continue;
			} else {
				continue;
			}
		}
		count++;

		System.out.println("\nLoops " + count + ":\n");
		for (int z = 5; z < 101; z += 5) {
			if (z <= 50) {
				System.out.println(z);
				continue;
			} else {
				break;
			}
		}
		count++;

		System.out.println("\nLoops " + count + ":\n");
		for (int y = 1; y < 3; y++) {
			System.out.println("Week " + y + ":");
			for (int d = 1; d < 6; d++) {
				System.out.println("Day " + d);
			}
		}
		count++;

		System.out.println("\nLoops " + count + ":\n");
		for (int m = 10; m < 200; m++) {
			String n = Integer.toString(m);
			if (n.charAt(0) == n.charAt(n.length() - 1)) {
				System.out.println(n);
			} else {
				continue;
			}
		}
		count++;

		System.out.println("\nLoops " + count + ":\n");
		int p = 0;
		int f = 1;
		subcount = 0;
		while (subcount < 10) {
			System.out.println(p);
			int s = p + f;
			p = f;
			f = s;
			subcount += 1;
		}
		count++;

		System.out.println("\nLoops " + count + ":\n");
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}

}
