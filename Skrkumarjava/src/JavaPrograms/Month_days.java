package JavaPrograms;

import java.util.Scanner;

public class Month_days 
{
	
	
	public void getvalidate(String input)
	{
		if(input.equals("january"))
		{
			System.out.println("31 days in mont of jan");
		}
		else if(input.equals("february"))
		{
			System.out.println("28 days in month of feb");
		}
		else if(input.equals("march"))
		{
			System.out.println("31 days in month of march");
		}
		else if(input.equals("april"))
		{
			System.out.println("30 days in month of april");
		}
		else if(input.equals("may"))
		{
			System.out.println("31 days in month of may");
		}
		else if(input.equals("june"))
		{
			System.out.println("30 days in month of june");
		}
		else if(input.equals("july"))
		{
			System.out.println("31 days in month of july");
		}
		else if(input.equals("august"))
		{
			System.out.println("31 days in month of august");
		}
		else if(input.equals("september"))
		{
			System.out.println("30 days in month of september");
		}
		else if(input.equals("october"))
		{
			System.out.println("31 days in month of october");
		}
		else if(input.equals("november"))
		{
			System.out.println("30 days in month of november");
		}
		else if(input.equals("december"))
		{
			System.out.println("31 days in month of december");
		}
		
	}
    public static void main(String[] args) {
    	Month_days ob =new Month_days ();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("please enter the month name");
    	String month=sc.next();
    	ob.getvalidate(month);
    	sc.close();
}
}
