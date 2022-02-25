package ProgramsNew;

import java.util.Scanner;

public class Exception_handlingmultiple {
public void getA1(int input)
{
	try
	{
        int a=10/input;
         String ab="sonu";
        int out  =Integer.parseInt(ab);
       
	}
	catch(ArithmeticException e)
	{
		System.out.println("Airthmetic exceptio "+e);
		System.out.println("please enter vaild num");
		main(null);
	}
  catch(NumberFormatException e)
	{
	System.out.println(e);
	getA2();
	getA3();
	}
	
	}


public void getA2()
{
	System.out.println("hello a2");
}
public void getA3()
{
	System.out.println("hello a3");

}

	public static void main(String[] args) {
		Exception_handlingmultiple ob=new Exception_handlingmultiple();
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the input");
		int input =sc.nextInt();
		ob.getA1(input);
		sc.close();
	}
}
