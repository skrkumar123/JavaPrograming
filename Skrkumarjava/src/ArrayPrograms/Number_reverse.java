package ArrayPrograms;

import java.util.Scanner;

public class Number_reverse {

	public void getdata(int num)
	{
		String out="";
		for(;num>0;)
		{
			int a=num%10;
			num=num/10;
			out =out+a;
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		Number_reverse ob= new Number_reverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int num=sc.nextInt();
		ob.getdata(num);
	}
}
