package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMap_map {

	public static void getitrator() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		Set<Entry<Integer, String>> entry = map.entrySet();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the 10 key and value");

		for (int i=0; i<=9;i++) 
		{
			map.put(sc.nextInt(), sc.next());
		}
		Iterator<Entry<Integer, String>> itr = entry.iterator();

		while (itr.hasNext())
		{
			Entry<Integer, String> dd = itr.next();
			System.out.println(dd.getKey() + " " + dd.getValue());
		}
	}
	public static void main(String[] args) {
		getitrator();
	}
}
