package main.java;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> bethany = new LinkedList<Integer>();
		bethany.add(1);
		bethany.add(2);
		bethany.add(3);
		bethany.add(4);
		bethany.set(0, 25);
		bethany.set(1, 50);
		bethany.set(2, 75);
		bethany.set(3, 100);
		System.out.println(bethany.get(0));
		System.out.println(bethany.get(1));
		System.out.println(bethany.get(2));
		System.out.println(bethany.get(3));
		System.out.println(bethany.size());
		if (bethany.contains(100)) {
			System.out.println("It got it!");
		}else {
			System.out.println("It didn't got it...");
		}
		EnumMap<DayOfWeek, Integer> daysOfTheWeek = new EnumMap<>(DayOfWeek.class);
		daysOfTheWeek.put(DayOfWeek.FRIDAY, 23);
		
		HashMap<String, Integer> namesAndIds = new HashMap<>();
		
		String[] names = new String[3];
		names[0] = "One";
		names[1] = "Two";
		names[2] = "Three";
		
		Integer[] nameId = new Integer[3];
		nameId[0] = 1;
		nameId[1] = 2;
		nameId[2] = 3;
		
		for (int x = 0; x< names.length; x++) {
			namesAndIds.put(names[x], nameId[x]);	
		}
		System.out.println(namesAndIds.toString());
		
//		The following is often used in spring:
		
		HashSet<String> hashSetStuff = new HashSet<>();
		hashSetStuff.add("Bej!");
		hashSetStuff.add("Nej!");
		hashSetStuff.add("Hej!");
		hashSetStuff.add("Hej!");
		// Note that upon printing, the duplicate "Hej!" is omitted. This is because SETS AND HASHSETS CAN ONLY HAVE ORIGINAL VALUES!
		Iterator<String> itr = hashSetStuff.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
}

Vector<>