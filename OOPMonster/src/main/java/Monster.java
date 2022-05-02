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
	static void checkMonster(String name) throws CustomExceptionFile{
		String nombre = name;
		if (nombre == ("r2r2")) {
			throw new CustomExceptionFile("You cannot use "+nombre+" as a name!:(");
		}else {
			System.out.println("You did it");
		}
	}
}
