package ArrayPrograms;

import java.util.Scanner;

public class Palindrom {
	
	public void get(int num )
	{
		
		String out="";
		for(;num>0;)
		{
			int a=num%10;
			num=num/10;
			out=out+a;
}
		System.out.println(out);
	
		
	}
	public static void main(String[] args) {
		Palindrom ob=new Palindrom();
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the number");
		int num=sc.nextInt();
		ob.get(num);
	}
}
