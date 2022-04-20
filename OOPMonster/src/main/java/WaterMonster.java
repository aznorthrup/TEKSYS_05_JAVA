package main.java;

public class WaterMonster extends Monster{

	public WaterMonster(String name) {
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
		return "WaterMonster [attack=" + attack + ", name=" + name + "]";
	}
	
	public void attack() {
		System.out.println("Attack with water!");
	}

}
