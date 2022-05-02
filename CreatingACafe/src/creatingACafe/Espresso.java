package creatingACafe;

import java.util.Scanner;

public class Espresso extends Product{
	boolean extraShot;
	boolean macchiato;
	
	public Espresso(){
		super("Espresso", 2.00, 0);
		this.extraShot = false;
		this.macchiato = false;
	}
	
	public Espresso(String name, double price, int quantity, boolean extraShot, boolean macchiato) {
		super("Espresso", 2.00, 0);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	public boolean isExtraShot() {
		return extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	double calculateProductTotal(int quantity) {
		double price = this.getPrice();
		double salesTax = 3.00;
		double addOnsTotal = 0;
		if (this.extraShot) {
			addOnsTotal+=2.00;
		}
		if(this.macchiato) {
			addOnsTotal+=1.00;
		}
		double subtotal = (quantity * (price + addOnsTotal + (((price+addOnsTotal)*salesTax)/100)));
		return subtotal;
	}
	
	private static Scanner espressoScanner = new Scanner(System.in);

	@Override
	void addOptions() {
		System.out.println("Do you want an extra shot? (Yes or No)");
		String extraShot = espressoScanner.nextLine();
		if (extraShot.toLowerCase() =="yes") {
			this.setExtraShot(true);
		}
		System.out.println("Do you want it as a macchiato?");
		String macchiato = espressoScanner.nextLine();
		if (macchiato.toLowerCase() =="yes") {
			this.setMacchiato(true);
		}		
		espressoScanner.close();
	}

	@Override
	String printOptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
