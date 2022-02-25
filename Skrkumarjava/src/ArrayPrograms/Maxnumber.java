package ArrayPrograms;

import java.util.Scanner;

public class Maxnumber {

	public void getmax(int a[])
	{
	 int maximum=0;
		for(int i=0;i<=a.length-1;i++)
			{
			if (a[i]>maximum)
			{
				maximum=a[i];
			}
			
		}
		System.out.println(maximum +" is max num");
	}
	public static void main(String[] args) {
		Maxnumber ob=new Maxnumber();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter num");
		 int[] a = new int [5];
		 for(int j=0;j<=a.length-1;j++)
		 {
			 a[j]=sc.nextInt();
		 }
		 ob.getmax(a);
	}
	
}
