package JavaPrograms;

import java.util.Scanner;

public class Calculator_ifelse
{
	int a,b,c;
	
	Scanner sc=new Scanner(System.in);
	public void getdata(int input)
   
	{
	   if(input==1)
	   {
	  System.out.println("please enter  two value for add");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a+b;
	    System.out.println(c);}
	    
  
	    else if(input==2)
   {
	    System.out.println("please enter two value for sub");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a-b;
	   System.out.println(c);
   }
	   else if(input==3)
   {
	     System.out.println("Please enter two value for multi");
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=a*b;
	      System.out.println(c);
	    }
	   else if(input==4)
   {
	      System.out.println("please enter two value for div");
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=a/b;
	      System.out.println(c);
   }
   }

	public static void main(String[] args)
	{
		Calculator_ifelse ob=new Calculator_ifelse();
		Scanner sc=new Scanner(System.in);
	System.out.println("press 1 for add,press 2 for sub,press 3 for multi,press 4 for div");
	    int num=sc.nextInt();
		ob.getdata(num);
		sc.close();
		
	}
}

