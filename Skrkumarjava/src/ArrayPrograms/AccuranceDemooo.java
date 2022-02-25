package ArrayPrograms;

import java.util.Scanner;

public class AccuranceDemooo 
{
	public void getdata(String input)
	{
		char[] c = input.toCharArray();
		
		for(int i=0;i<=c.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			System.out.println(c[i]+" char comes in given string "+count+" times");
		}
		
	}
	public static void main(String[] args)
	{
		AccuranceDemooo ob = new AccuranceDemooo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = sc.next();
		ob.getdata(input);
	}
}
