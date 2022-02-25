package Collections;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList<String> name =new ArrayList<String>();
		
		ArrayList<String> clone =new ArrayList<String>();

		name.add("sonu");
		name.add("pawan");
		name.add("raja");
		name.add("ravi");
		name.add("shyam");
	System.out.println(name);
		//System.out.println(name.get(2));
		name.remove(3);
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.contains("ravi"));
		//System.out.println(name);
		name.set(1, "parka");
		System.out.println(name);
		name.clear();
		System.out.println(name);
	}
}
