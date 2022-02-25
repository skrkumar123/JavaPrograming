package ProgramsNew;

public class Overloading_method {

	public void getdetails(int a)
	{
		System.out.println("train number  2222525");
	}
	public void getdetails(String name)
	{
		System.out.println("train name");
	}
	public void getdetails(String from ,String to)
	{
		System.out.println("train destination");
	}
	public static void main(String[] args) {
		Overloading_method ob=new Overloading_method();
		ob.getdetails("shimla","manali");
		ob.getdetails(2222);
		ob.getdetails("rajdhani express");
	
	}
}
