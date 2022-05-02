package creatingACafe;

import java.util.Scanner;

public class Coffee extends Product{
	boolean sugar;
	boolean milk;
	
	public Coffee(){
		super("Coffee", 4.00, 0);
		this.sugar = false;
		this.milk = false;
	}
	
	public Coffee(boolean sugar, boolean milk) {
		super("Coffee", 4.00, 0);
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public boolean isSugar() {
		return sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	@Override
	double calculateProductTotal(int quantity) {
		double price = this.getPrice();
		double salesTax = 3.00;
		double subtotal = (quantity * (price + ((price*salesTax)/100)));
		return subtotal;
	}

	@Override
	void addOptions(boolean sugar, boolean milk) {
		this.sugar = sugar;
		this.milk = milk;
	}

	@Override
	String printOptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
