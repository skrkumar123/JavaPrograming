package JavaPrograms;

import java.util.Scanner;

public class Findgreatestnumber {
	
	public void getnumber(int a)
	{
		if(a>=1)
		{
	
		}
		else
		{
			System.out.println("invailid");
		}
	}

	public static void main(String[] args) {
		Findgreatestnumber ob=new Findgreatestnumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the 3 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
     ob.getnumber(a);
     ob.getnumber(b);
     ob.getnumber(c);
     
	
	
	   
	}
}
