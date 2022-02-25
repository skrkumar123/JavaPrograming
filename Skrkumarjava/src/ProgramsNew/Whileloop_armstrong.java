package ProgramsNew;

import java.util.Scanner;

public class Whileloop_armstrong {

	public void getarmstrong(int num)
	{
		
		int tem=num;
		int out=0;
		while(num>0)
		{
			
			int a=num%10;
			num=num/10;
			out=out+(a*a*a);
		}
		if(tem==out)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		Whileloop_armstrong  ob=new Whileloop_armstrong ();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the num");
		int num=sc.nextInt();
		ob.getarmstrong(num);
		sc.close();
	}
	
}
