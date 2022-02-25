package ProgramsNew;

public class StringMethods {

	public static void main(String[] args) {
		String s= "Hellojava";
		System.out.println(s.contains("aj"));
		System.out.println(s.concat("beam"));
		System.out.println(s);
		
		System.out.println(s.toCharArray());
		System.out.println(s.split(s));
		System.out.println(s.equals("HELLOJAVA"));
		System.out.println(s.equalsIgnoreCase("HELLOJAVA"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(2,7));
		System.out.println(s.replace("Hello", "sonu"));
	}
}
