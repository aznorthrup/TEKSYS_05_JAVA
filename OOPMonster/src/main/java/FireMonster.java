package main.java;

public class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
		this.name = name;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "FireMonster [attack=" + attack + ", name=" + name + "]";
	}
	
	public void attack() {
		System.out.println("Attack with fire!");
	}
	
}
