package JavaPrograms;

public class Calculaterdemmo 
{
     int a,b,c;
	public void getvalue()
	{
		 a=18;
		 b=14;
		 c=a+b;
		System.out.println(c);
		 a=35;
		 b=32;
		 c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[]args)
	{
		 Calculaterdemmo ob=new Calculaterdemmo();
		 ob.getvalue();
		
	}
	
}
