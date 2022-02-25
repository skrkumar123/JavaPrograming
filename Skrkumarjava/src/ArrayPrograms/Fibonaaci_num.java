package ArrayPrograms;

import java.util.Scanner;

public class Fibonaaci_num 
{ 
	public void getseries(int num)
	{
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<=num-1;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
public static void main(String[] args) {
	Fibonaaci_num ob= new Fibonaaci_num();
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter num");
	int num =sc.nextInt();
	ob.getseries(num);
}
}
