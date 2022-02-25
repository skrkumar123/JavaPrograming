package ArrayPrograms;

import java.util.Scanner;

public class Findchar {
	
	public void getcvalidate(String input,char a)
	{
		// rameshwaram
		char[]out=input.toCharArray();
		
		int count=0;
		for(int i=0;i<=out.length-1;i++)
		{
			if(out[i]==a)
			{
				count++;
			}
		
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Findchar ob=new Findchar();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter string");
		String input=sc.next();
		System.out.println("please enter char");
		char a=sc.next().charAt(0);
		ob.getcvalidate(input, a);
	}
}
