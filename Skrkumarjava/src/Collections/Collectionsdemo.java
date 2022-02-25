package Collections;

import java.util.ArrayList;

public class Collectionsdemo {

	
	public static void main(String[] args) {
		
		ArrayList li=new ArrayList();
		li.add(8);
		li.add("sonu");
		li.add('a');
		li.add("rajput");
		
		for(Object dd:li)
		{
			
			System.out.println(dd);
		}
	}
}
