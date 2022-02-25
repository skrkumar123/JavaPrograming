package Collections;

import java.util.Vector;

public class Vectordemo {

	
	public static void main(String[] args) {
		Vector<String >name=new Vector<>();
		name.add("sonu");
		name.add("pawan");
		name.add("raja");
		name.add("parka");
		name.add("ankit");
		
	//name.insertElementAt("pawan", 3);
	//name.removeElementAt(2);
		
		
		for( String dd:name)
		{
			System.out.println(dd);
			
		}
		System.out.println(name.firstElement());
		System.out.println(name.lastElement());
		
		
	}
}
