package ArrayPrograms;

import java.util.Scanner;

public class CountChardemoo 
{

	public void getvalidatechar(String input, String inputc)
	{
	
		String[] a = input.split(" ");
		int count=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i].equals(inputc))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		CountChardemoo ob= new CountChardemoo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String input = sc.nextLine();
		System.out.println("Please enter the String");
	    String inputc=sc.next();
		ob.getvalidatechar(input, inputc);
	}
}