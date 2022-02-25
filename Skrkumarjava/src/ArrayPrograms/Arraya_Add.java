package ArrayPrograms;

import java.util.Scanner;

public class Arraya_Add 
{ 
	public void getadd(int a[],int b[])
	{
		for( int k=0;k<=a.length-1;k++)
		{
			System.out.println(a[k]+b[k]);
		}
		}
		
			public void getmulti(int a[],int b[])
	{
				System.out.println("please find multi");
				for( int k=0;k<=a.length-1;k++)
				{
					System.out.println(a[k]*b[k]);
				}
		System.out.println();
	}
			public void getdiv(int a[],int b[])
			
			{
				System.out.println(" please find div");
				for(int k=0;k<=a.length-1;k++)
				{
					System.out.println(a[k]/b[k]);
				}
			}
  public static void main(String[] args) {
	  Arraya_Add  ob=new  Arraya_Add ();
	  Scanner sc=new Scanner(System.in);
	  int[]a=new int[5];
	  int[]b=new int[5];
	  System.out.println("please enter first value");
	  
	  for(int i=0;i<=4;i++)
	  {
		a[i]=sc.nextInt();
	  } 
	  System.out.println("please enter second value");
	  for(int j=0;j<=4;j++)
	  {
		  b[j]=sc.nextInt();
	  }
	 
	  ob.getadd(a,b);
	  ob.getmulti(a, b);
	  ob.getdiv(a, b);
}
  

}
