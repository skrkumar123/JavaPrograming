package ArrayPrograms;

import java.util.Scanner;

public class SecondHighest
{

	public void getdata(int a[])
	{
		// a[]=[67, 45, 65, 87, 49]
		int max=a[0];
		int secondmax=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
			}
			else if(secondmax<a[i])
			{
				secondmax=a[i];
			}
		}
		System.out.println(secondmax);	
	}
	
	
	public static void main(String[] args)
	{
		SecondHighest ob =new SecondHighest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the num");
		int a[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
			ob.getdata(a);
	}
}
