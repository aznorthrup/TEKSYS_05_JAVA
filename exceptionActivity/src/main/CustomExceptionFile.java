package main;

public class CustomExceptionFile extends Exception{
private double amount;	
	public CustomExceptionFile(String message) {
			super(message);
			this.amount = amount;
		}
	
	public double getAmmount() {
		return amount;
	}
}