package ProgramsNew;

public class Throwsdemo {
	
	public void getvarify() throws InterruptedException
	{
		
		Thread.sleep(3000);
		System.out.println("hello getverify method");
	}

	public static void main(String[] args) throws InterruptedException
	{
		Throwsdemo ob=new Throwsdemo();
		ob.getvarify();
	}
}
