package ArrayPrograms;

import java.util.Scanner;

public class Reverse_name
{
public void getreverce(String input)
{
	
	char[]a=input.toCharArray();
	String out="";
	int len=a.length;
	for(int j=len-1;j>=0;j--)
	{
		out=out+a[j];
	}
	System.out.println(out);
}
	public static void main(String[] args) {
		Reverse_name ob=new Reverse_name();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name");
		String input=sc.next();
		ob.getreverce(input);
	}
}
