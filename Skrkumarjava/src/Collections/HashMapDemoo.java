package Collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemoo 
{

	
	public static void main(String[] args)
	{
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(12, "sonu");
		map.put(15, "parka");
		map.put(14, "ravi");
		map.put(20, "raja");
		map.put(30, "shivam");
		
	 Set<Entry<Integer, String>> entry = map.entrySet();
	  Iterator<Entry<Integer, String>> itr = entry.iterator();
	 
	 while(  itr.hasNext() )
	 {
	            Entry<Integer, String> dd = itr.next();
	           System.out.println(dd.getKey()+" " +dd.getValue());
	                
	               
	}
	
	
}}
