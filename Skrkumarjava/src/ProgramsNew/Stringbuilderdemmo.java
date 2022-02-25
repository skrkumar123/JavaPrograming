package ProgramsNew;

public class Stringbuilderdemmo {

	
	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("testjava");
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.insert(2, "m"));
		System.out.println(sb.delete(2, 5));
	}
}
