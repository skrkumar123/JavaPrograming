package ProgramsNew;

class Ram
{
	public void getA() // if we use final key here then we are unable to override the method
	{
		int a=40;
		System.out.println(a);
		
	}
}
public class Final_method extends Ram {
	
	public void getA()
	{
		
		int a=50;
		System.out.println(a);
	}
	
	
public static void main(String[] args) {
	Final_method ob= new Final_method();
ob.getA();
	
			
}
}
