package ProgramsNew;




public class Exception_handling {

	public void getA()
	{
		System.out.println("hello a method");
	}
	public void getB()
	{
		try
		{
			int a=10/0;
		}
		catch(Exception e)
		{
			System.out.println("issue in b method"+e);
		}
		finally
		{
			System.out.println("helllo finally");
		}
	}
		
	
	public void getC()
	{
		System.out.println("hello c meyhod");
	}

	public static void main(String[] args) {
		Exception_handling ob =new Exception_handling();
		ob.getA();
		ob.getB();
		ob.getC();
		
	}
}
