package ArrayPrograms;



import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Uniquecharctor
{
	
	
	public static void main(String[] args) 
	{
		HashMap<Integer, String> li=new LinkedHashMap<Integer, String>();
		
		li.put(12, "sonu");
		li.put(25, "pawan");
		li.put(18, "ravi");
		 Set<Entry<Integer, String>> entry = li.entrySet();
		 Iterator<Entry<Integer, String>> itr = entry.iterator();
		 
		 
		 while(itr.hasNext())
		 {
			 Entry<Integer, String> dd = itr.next();
			 System.out.println(dd.getKey()+""+dd.getValue());
			 
		 }
		
	}
}
