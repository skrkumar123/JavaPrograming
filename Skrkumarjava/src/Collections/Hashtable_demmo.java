package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable_demmo {
  
	public static void getHashtable() 
	{
		   
           Hashtable<Integer, String> map =new Hashtable<>();
           map.put(12, "ranjan");
           map.put(18, "shiva");
           map.put(16, "hema");
           map.put(19, "neha");
           map.put(20, "sonu");
           Set<Entry<Integer, String>> entry = map.entrySet();
           
             Iterator<Entry<Integer, String>> itr = entry.iterator();
             while(itr.hasNext())
             {
            	 
            	  Entry<Integer, String> dd = itr.next();
            	  System.out.println(dd.getKey()+" "+dd.getValue());
             }
             
 		
	}
	
	
	public static void main(String[] args) {
		getHashtable();
	}
}
