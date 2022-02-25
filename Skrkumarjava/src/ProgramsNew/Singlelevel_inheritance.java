package ProgramsNew;

class Surajdemo //parents class
{
	public void getverify()
	{
		System.out.println("suraj is good boy");
	}
}

public class Singlelevel_inheritance extends Surajdemo //child class
{
public void getdata()
{
	System.out.println("sonu rajput");
}
	public static void main(String[] args) {
		Singlelevel_inheritance ob=new Singlelevel_inheritance();
		ob.getverify();
		ob.getdata();
	}
}
