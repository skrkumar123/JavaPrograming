package Collections;

import java.util.HashSet;

public class Hashset_LinkedHashset {
	public static void getdata()
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("sonu");
		hs.add("ravi");
		hs.add("ankit");
		hs.add("pawan");
		hs.add("sonu");
		
		for( String dd:hs)
		{
			System.out.println(dd);
		}
		
		
		
		
	}
public static void main(String[] args) {
	getdata();
}
	
}
