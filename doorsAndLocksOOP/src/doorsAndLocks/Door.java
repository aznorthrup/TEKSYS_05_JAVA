package doorsAndLocks;

import java.util.HashMap;

public class Door extends Key{
	boolean isLocked;
	boolean hasKey;
	HashMap<String, String> doorsAndKeys = new HashMap<>();
	
	
	public Door() {
		Key newKey = new Key();
		doorsAndKeys.put(newKey);
		boolean isLocked = true;
		boolean hasKey = true;
		
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	public boolean hasKey() {
		return hasKey;
	}
	
	public boolean containsKey(Door door) {
		 doorsAndKeys.put(null, null)
	}
	
	public boolean unlock(Door door) {
		if (!door.isLocked()) return true;
		if(!door.hasKey()) return true;
}
}
