package ArrayPrograms;

import java.util.Scanner;

public class Countmax2 
{
	public void getdata(String input)
	{
		char[] c = input.toCharArray();
		
		for(int i=0;i<=c.length-1;i++)
		{
			int count=1; int z=0;
			for(int k=0;k<i;k++)
			{
				if(c[i]==c[k])
				{
					z=1;
				}
			}
			if(z==1)
			{
			continue;
			}
			else
			{
			for(int j=i+1;j<=c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(c[i]+" char comes in given string "+count+" times");
			}
		}
		}
		
	}
	public static void main(String[] args)
	{
		Countmax2 ob = new Countmax2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = sc.next();
		ob.getdata(input);
	}
}

