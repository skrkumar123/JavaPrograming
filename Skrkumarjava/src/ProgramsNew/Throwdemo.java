package ProgramsNew;

import java.util.Scanner;

public class Throwdemo {

	public void getvalidate(int age)
	{
		try 
		{
			if (age<18)
			{
				throw new Exception("not valid age");
			}
			else
			{
				System.out.println("valid age");}}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	
	public static void main(String[] args) {
		Throwdemo ob=new Throwdemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter age");
		int age = sc.nextInt();
		ob.getvalidate(age);
	}
}
