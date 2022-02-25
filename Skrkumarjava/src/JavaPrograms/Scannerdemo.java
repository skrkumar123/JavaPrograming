package JavaPrograms;

import java.util.Scanner;

public class Scannerdemo
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
   
	public void add()
   {
	   
	  System.out.println("please enter  two value for add");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a+b;
	    System.out.println(c);
	    
  }
   public void sub()
   {
	    System.out.println("please enter two value for sub");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a-b;
	   System.out.println(c);
   }
   public void multi()
   {
	     System.out.println("Please enter two value for multi");
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=a*b;
	      System.out.println(c);
	    }
   public void div()
   {
	      System.out.println("please enter two value for div");
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=a/b;
	      System.out.println(c);
   }
	public static void main(String[] args)
	{
		Scannerdemo ob=new Scannerdemo();
	
		ob.add();
		ob.sub();
		ob.multi();
		ob.div();
		
	}
}
