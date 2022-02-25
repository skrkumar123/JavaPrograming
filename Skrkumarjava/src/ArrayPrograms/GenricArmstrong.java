package ArrayPrograms;

import java.util.Scanner;

public class GenricArmstrong
{
	public int getlength(int num)
	{
		int len=0;
		for(;num>0;)
		{
			num=num/10;
			len++;
		}
		return len;
	}
	public void getarmstrong(int num)
	{
		int temp=num;
		int out=0;
		int length = getlength(num);
		for(;num>0;)
		{
			int a=num%10;
			num=num/10;
			int sum=1;
			for(int k=1;k<=length;k++)
			{
				sum=(sum*a);
			}
			out=out+sum;
		}
		if(out==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not amrstrong");
		}	
	}
	public static void main(String[] args)
	{
		GenricArmstrong ob = new GenricArmstrong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the num");
		int num = sc.nextInt();
		ob.getarmstrong(num);
	}
}
