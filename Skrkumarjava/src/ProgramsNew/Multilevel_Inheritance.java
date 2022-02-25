package ProgramsNew;

import java.util.Scanner;

class ankit
{
	public void geta()
	{
		System.out.println(" a method");
	}
}
class sonu extends ankit
{
	public void getb() 
	{
		System.out.println("B method");
	}
}

public class Multilevel_Inheritance extends sonu
{
	public void getc()
	{
		System.out.println("c method");
	}
	
public static void main(String[] args) {
	Multilevel_Inheritance ob=new Multilevel_Inheritance();
	Scanner sc= new Scanner(System.in);

	ob.geta();
	ob.getb();
	ob.getc();
   sc.close();
	
}
}
