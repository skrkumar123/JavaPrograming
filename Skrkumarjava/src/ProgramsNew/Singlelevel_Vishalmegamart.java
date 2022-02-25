package ProgramsNew;


import java.util.Scanner;

class Reversestring
{
	public void getreverse(String input)
	{
		String[] s=input.split(" ");
		String out="";
		for(int i=0;i<=s.length-1;i++)
		{
			char[] c = s[i].toCharArray();
			for(int k=c.length-1;k>=0;k--)
			{
				out=out+c[k];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
}
public class Singlelevel_Vishalmegamart extends Reversestring
{

	public void getdata( String name, String []a, int[]b )
	{
		 System.out.println("----vishalBill----");
		 System.out.println("coustomer name: "+name);
		for(int i=0;i<=a.length-1;i++) {
		System.out.println("product name: "+a[i]);}

		for(int n=0;n<=b.length-1; n++)
		{
			int amount=b[n];
			System.out.println("product ammount: "+amount);}
			int total=0;
		for(int l=0;l<=b.length-1;l++)
		{
			total=total+b[l];
		 }
		  System.out.println("total amount is: "+total);
		  if (total<500)
		  {
			 int gst=(total*12)/100;
			  System.out.println("gst is "+gst);
			  int totalpayble=gst+total;
	            System.out.println("totalpayble: "+totalpayble);
		  }
		  else if(total>=500&&total<1000)
		  {
			 int gst=(total*15)/100;
			  System.out.println("gst is "+gst);
			 int totalpayble=gst+total;
	            System.out.println("totalpayble: "+totalpayble);
		  }
		  else 
		  {
			int gst=(total*18)/100;
		      System.out.println("gst is "+gst);
		   int totalpayble=gst+total;
            System.out.println("totalpayble: "+totalpayble);
			
		  }
	}
	public static void main(String[] args) {
		Singlelevel_Vishalmegamart ob=new Singlelevel_Vishalmegamart();
		Scanner sc = new Scanner(System.in);
        System.out.println("please enter string");
			String input=sc.nextLine();
		     ob.getreverse(input);
		     System.out.println("please enter coustomer name");
		     String name=sc.nextLine();
		System.out.println("Please enter the size of product");
		int size=sc.nextInt();
		String c[]=new String [size];
		int d[]=new int [size];
		System.out.println("please enter your Product name");
		for(int k=0;k<=size-1;k++)
		{
			c[k]=sc.next();
		}
			System.out.println("please enter  product amount");
		for(int j=0;j<=size-1;j++)
		{
			d[j]=sc.nextInt();
		}
		   ob.getdata(name,c, d);
		   
		   sc.close();
		   }
}

	
    


