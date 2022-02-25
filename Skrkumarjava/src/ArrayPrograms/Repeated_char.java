package ArrayPrograms;

import java.util.Scanner;

public class Repeated_char {
	public void getchar(String input, char a)
	{
		int length = input.length();
		char[]out=input.toCharArray();
		for( int i=0;i<length-1;i++) {
			for(int j=i+1;j<length-1;j++) {
				if (out[i]==out[j]) {
			System.out.println( out[j]);
				break;
		
			}
		}
	}
	}
			
 public static void main(String[] args) {
	 Repeated_char ob = new Repeated_char();
	 Scanner sc= new Scanner(System.in);
	 System.out.println("please enter the string");
	 String input=sc.next();
	 
      char a= sc.next().charAt(0);
	 ob.getchar(input, a);
}
}
