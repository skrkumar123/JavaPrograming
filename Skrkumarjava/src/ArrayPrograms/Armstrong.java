package ArrayPrograms;

import java.util.Scanner;

public class Armstrong {

	public void getdata(int num)
	{
		int temp=num;
		int sum=0;
		for(;num>0;)
		{
			int a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println(temp+" is armstrong");
		}
		else 
		{
			System.out.println(temp+" is not armstrong");
		}
	}
	public static void main(String[] args) {
		Armstrong ob=new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the num");
		int num=sc.nextInt();
		ob.getdata(num);
	}
}
