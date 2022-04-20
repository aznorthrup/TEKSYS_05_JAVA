package main.java;

public class TestMonster {

	public static void main(String[] args) {
		
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		

		m1.attack();
		m2.attack();
		m3.attack();

		m1 = new StoneMonster("a2b2");
		m1.attack();

		Monster m4 = new Monster("u2u2");
		m4.attack();

	}

}
