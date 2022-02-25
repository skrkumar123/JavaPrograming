package JavaPrograms;


import java.util.Scanner;
public class Vishalmegamart
{	
	public  void getbill(String name, long mobile,
			String productname,float amount)
	{
		System.out.println("     *****Vishal megha mart*****");
		System.out.println("Cutomer name is "+name);
		System.out.println("Customer Mobile no is "+mobile);
		System.out.println("Product name is "+productname);
		System.out.println("Product amount is "+amount);
		
		float gst=(amount*18)/100;
		System.out.println("product GSt is "+gst);
		float total=amount+gst;
		System.out.println("_____________________________");
		System.out.println("Your payble amount is "+total);
	System.out.println(	"__________________________________");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		Vishalmegamart ob = new Vishalmegamart();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the productname ");
		String productname = sc.nextLine();
		System.out.println("Please enter the name");
		String name = sc.nextLine();
		System.out.println("Please enter the mobile no");
		long mobile = sc.nextLong();
		System.out.println("Plese enter the product amount ");
		float amount = sc.nextFloat();
		ob.getbill(name, mobile, productname, amount);
		sc.close();
	}
}
