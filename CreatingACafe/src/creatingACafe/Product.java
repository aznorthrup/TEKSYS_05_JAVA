package creatingACafe;

abstract class Product extends Store{
	private String name = "";
	private double price = 0.00;
	private String description = "";
	private int quantity = 0;
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	abstract double calculateProductTotal(int quantity);
	abstract void addOptions(boolean option1, boolean option2);
	abstract String printOptions();
}
