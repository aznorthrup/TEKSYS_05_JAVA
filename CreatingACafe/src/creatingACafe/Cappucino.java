package creatingACafe;

public class Cappucino extends Product{
	boolean peppermint;
	boolean whippedCream;
	
	public Cappucino(){
		super("Cappucino", 5.00, 0);
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	protected Cappucino(String name, double price, int quantity, boolean peppermint, boolean whippedCream) {
		super("Cappucino", 5.00, 0);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	
	public boolean isPeppermint() {
		return peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	double calculateProductTotal(int quantity) {
		double price = this.getPrice();
		double salesTax = 3.00;
		double addOnsTotal = 0;
		if (this.peppermint) {
			addOnsTotal+=2.00;
		}
		if(this.whippedCream) {
			addOnsTotal+=1.00;
		}
		double subtotal = (quantity * (price + addOnsTotal + (((price+addOnsTotal)*salesTax)/100)));
		return subtotal;
	}

	@Override
	void addOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String printOptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
