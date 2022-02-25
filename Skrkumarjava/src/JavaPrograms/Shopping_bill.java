package JavaPrograms;

import java.util.Scanner;

public class Shopping_bill 
{
	public void getdetails(String name,long mobile,String productname,float amount,float gst)
	{
		System.out.println("**********vishal mega mart*********");
		System.out.println("customer name:  "+name);
		System.out.println("mobile no:  "+mobile);
		System.out.println("product name:  "+productname);
		System.out.println("product amount:  "+amount);
		System.out.println("product gst:  "+gst);
		float total=(amount+gst);
		System.out.println("taotalpayble:  "+total);
		
	}
	
 public static void main(String[] args) 
 {
	 Shopping_bill ob=new Shopping_bill();
	 Scanner sc= new Scanner(System.in);
	 System.out.println("please enter the customer name");
	 String name =sc.next();
	 System.out.println("please enter the mobile no");
	 long mobile=sc.nextLong();
	 System.out.println("please enter the product name");
	 String product=sc.next();
	 System.out.println("please enter the product amount");
	 float amount=sc.nextFloat();
	 System.out.println("please enter the product gst");
	 float gst=sc.nextFloat();
	 ob.getdetails(name, mobile, product, amount, gst);
			 
	 
	 
	 
	 
}
}
