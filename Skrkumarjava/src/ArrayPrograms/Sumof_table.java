package ArrayPrograms;

import java.util.Scanner;

public class Sumof_table {
	
	
	public void gettable()
	{
		int [] a=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=a.length-1;j++)
		{
			int num;
			int sum=0;
			for(int k=1;k<=10;k++)
			{
				num=(a[j]*k);
				System.out.println(num);
				sum=sum+(a[j]*k);
				
			}
			System.out.println(sum);
		}
		
	}
	
public static void main(String[] args) {
	Sumof_table ob=new Sumof_table();
	ob.gettable();
}
}
