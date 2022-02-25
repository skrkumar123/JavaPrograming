package ProgramsNew;

class ravi
{
	public void getAb()
	{
		System.out.println("hello ravi");
	}
}

public class SuperMethod extends ravi
{
public void getAB()
{
	super.getAb();
	System.out.println("hello super method");
}
	public static void main(String[] args) {
		SuperMethod ob= new SuperMethod();
		ob.getAB();
	}
}
