package ArrayPrograms;

import java.util.Scanner;

public class Primenumber
{

	public void getvalidatenum(int num)
	{

			if(num==0||num==1)
			{
				System.out.println(num+" prime no");
			}
			else
			{
				int flag=0;
				for(int j=2;j<num;j++)
				{
					if(num%j==0)
					{
						System.out.println(num+" is not prime no");
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(num+" is prime no");
				}
			}
			
	}
	
	
	public static void main(String[] args)
	{
		Primenumber ob = new Primenumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the num");
		int input = sc.nextInt();
		ob.getvalidatenum(input);
	}
}