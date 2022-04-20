package main.java;

public class StoneMonster extends Monster{

	public StoneMonster(String name) {
		super(name);
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "StoneMonster [attack=" + attack + ", name=" + name + "]";
	}
	
	public void attack() {
		System.out.println("Attack with stones!");
	}

}
