package ArrayPrograms;

import java.util.Scanner;

public class Even_odd {
	
	
	public void getoddeven(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
		if(i%2==0)
		{
			System.out.println(i+ " even number");
		}
		else
		{
			System.out.println(i +" odd number");
		}
		}
	}

	public static void main(String[] args) {
		Even_odd ob=new Even_odd();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter fisrst value");
		int a=sc.nextInt();
		System.out.println("please enter the second value");
		int b=sc.nextInt();
		ob.getoddeven(a, b);
	}
}
