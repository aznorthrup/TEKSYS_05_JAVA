package doorsAndLocks;

import java.util.UUID;

public abstract class Key{
	public UUID key = UUID.randomUUID();
	
	public Key() {
		key = UUID.randomUUID();
	}
	
	@Override
	public String toString() {
		return key.toString();
	}
	
	public Key(Key original) {
		key = original.key;
	}
	
}