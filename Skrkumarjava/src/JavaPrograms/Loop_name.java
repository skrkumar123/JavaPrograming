package JavaPrograms;

import java.util.Scanner;

public class Loop_name {
	
	public void getname(String name)
	{
		for(int i=1; i <=10;i++)
		{
		System.out.println(name+i);
		}
	}
public static void main(String[] args) {
	Loop_name ob=new Loop_name();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the name");
	String name= sc.next();
	ob.getname(name);
	sc.close();
	
}
}
