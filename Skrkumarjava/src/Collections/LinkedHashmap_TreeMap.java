package Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashmap_TreeMap {

	
	public static void main(String[] args) {
		
        // tree map maintain a ascending order
		TreeMap<Integer, String> mp=new TreeMap<Integer, String>();
		 mp.put(25, "ravi");
		 mp.put(28, "pawan");
		 mp.put(26, "chamn");
		 mp.put(29, "hero");
		 mp.put(32, "prince");
		 
		     Set<Entry<Integer, String>> e = mp.entrySet();
		     Iterator<Entry<Integer, String>> i = e.iterator();
		   while(i.hasNext())
		{
			 Entry<Integer, String> dd = i.next();
			 System.out.println(dd.getKey()+" "+ dd.getValue());
			
		}
		
//		LinkedHashMap<Integer, String> mp=new LinkedHashMap<Integer, String>();
//		 mp.put(44, "ravi");
//		 mp.put(28, "pawan");
//		 mp.put(26, "chamn");
//		 mp.put(29, "hero");
//		 mp.put(32, "prince");
//		 
//		     Set<Entry<Integer, String>> e = mp.entrySet();
//		     Iterator<Entry<Integer, String>> i = e.iterator();
//		   while(i.hasNext())
//		{
//			 Entry<Integer, String> dd = i.next();
//			 System.out.println(dd.getKey()+" "+ dd.getValue());
//			
//		}
//		 
//		 
//		 
	} 
}
