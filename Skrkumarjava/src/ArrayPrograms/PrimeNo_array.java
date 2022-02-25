package ArrayPrograms;

import java.util.Scanner;

public class PrimeNo_array 
{
	public void getdata(int a[])
	{
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]==0||a[j]==1)
			{
				System.out.println("prime no");
			}
			else
			{
				int flag=0;
				for(int l=2;l<a[j];l++)
				{ 
					if(a[j]%l==0)
					{
						System.out.println(a[j]+" not prime no");
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(a[j]+" is prime no");
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		PrimeNo_array ob = new PrimeNo_array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("please enter your value");
		for(int k=0;k<=size-1;k++)
		{
			b[k]=sc.nextInt();
		}
		ob.getdata(b);
		
	}
}
