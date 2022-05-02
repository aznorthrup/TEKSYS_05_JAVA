package creatingACafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		
//		Coffee coffeeOne = new Coffee(null, 0, 0, true, true);
//		coffeeOne.addOptions();
//		System.out.println(coffeeOne.calculateProductTotal(4));
//		
//		Espresso espressoOne = new Espresso(null, 0, 0, false, false);
//		System.out.println(espressoOne.calculateProductTotal(4));
//		
//		Espresso espressoTwo = new Espresso(null, 0, 0, false, true);
//		System.out.println(espressoTwo.calculateProductTotal(4));
//		
//		Espresso espressoThree = new Espresso(null, 0, 0, true, false);
//		System.out.println(espressoThree.calculateProductTotal(4));
//		
//		Espresso espressoFour = new Espresso(null, 0, 0, true, true);
//		System.out.println(espressoFour.calculateProductTotal(4));
//		
//		Cappucino capOne = new Cappucino(null, 0, 0, false, false);
//		System.out.println(capOne.calculateProductTotal(4));
//		
//		Cappucino capTwo = new Cappucino(null, 0, 0, false, true);
//		System.out.println(capTwo.calculateProductTotal(4));
//		
//		Cappucino capThree = new Cappucino(null, 0, 0, true, false);
//		System.out.println(capThree.calculateProductTotal(4));
//		
//		Cappucino capFour = new Cappucino(null, 0, 0, true, true);
//		System.out.println(capFour.calculateProductTotal(4));
		
		Scanner cafeScanner = new Scanner(System.in);
		boolean shopping = true;
		while (shopping) {
		System.out.println("Please select from the following menu:\n1: Coffee\n2: Cappucino\n3. Espresso\n4. Check Out");
		int choice = cafeScanner.nextInt();
		if (choice == 1) {
			boolean sugar = false;
			boolean milk = false;
			System.out.println("You chose coffee.");
			System.out.println("Do you want sugar? (Yes or No)");
			switch (cafeScanner.nextLine().toLowerCase()) {
			
			case "yes" : sugar = true; continue;
			case "no" : sugar = false; continue;
			default: System.out.println("This is bullshit");
			
			}cafeScanner.nextLine();
			System.out.println("Do you want milk?");
			switch (cafeScanner.nextLine().toLowerCase()) {
			
			case "yes" : milk = true; continue;
			case "no" : milk = false; continue;
			default: System.out.println("This is bullshit");
			
			}
			Coffee coffeeOne = new Coffee(sugar, milk);
			System.out.println(coffeeOne.getName() + ", " + coffeeOne.isSugar() + ", " + coffeeOne.isMilk());
			cafeScanner.close();
		}else if (choice == 2) {
			System.out.println("You chose espresso.");
			Espresso espressoOne = new Espresso();
			espressoOne.addOptions();
			System.out.println(espressoOne.getName());
			System.out.println(espressoOne.isExtraShot() + ", " + espressoOne.isMacchiato());
		}else if (choice == 3) {
			System.out.println("You chose cappucino.");
			Cappucino cappucinoOne = new Cappucino();
			cappucinoOne.addOptions();
			System.out.println(cappucinoOne.getName());
			System.out.println(cappucinoOne.isPeppermint()+", "+cappucinoOne.isWhippedCream());
		}else if (choice == 4) {
			System.out.println("You chose to check out.");
			
		}cafeScanner.close();
		}
	}

}
