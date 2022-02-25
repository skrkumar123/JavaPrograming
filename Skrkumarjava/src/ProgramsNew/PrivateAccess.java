package ProgramsNew;

class Rajademo
{
	private void getA()
	{
		System.out.println("helllo A method");
	}
	
	public void getB()
	{
		System.out.println("hello b method");
	}
	public static void main(String[] args) {
		Rajademo ob=new Rajademo();
		ob.getB();
		ob.getA();
}
}

public class PrivateAccess  {

	
	
	public static void main(String[] args) {
		
		Rajademo ob=new Rajademo();
		ob.getB();
		
		
	}
}
