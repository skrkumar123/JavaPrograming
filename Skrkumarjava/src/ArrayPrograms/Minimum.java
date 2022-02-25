package ArrayPrograms;

import java.util.Scanner;

public class Minimum {

	
	
		public void getno(int a[])
		{
			int minimum =a[0];
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]<minimum)
				{
					minimum=a[j];
					
				}
				}
			System.out.println("minimum no. is "+minimum);
			
		}
		public static void main(String[] args) 
		{
			Minimum ob = new Minimum();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the size of array");
			int size=sc.nextInt();
			int b[]=new int[size];
			for(int k=0;k<=size-1;k++)
			{
				b[k]=sc.nextInt();
			}
			ob.getno(b);
			
			
		}
}
