package main.java;

public class Monster {
	
	public String name;
	public String attack;
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	public Monster() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + "]";
	}
	
	public void attack() {
		System.out.println("!^_&amp;^$@+%$* I don&#39;t know how to attack!");
	}
	
}
