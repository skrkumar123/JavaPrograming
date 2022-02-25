package ProgramsNew;


public class Final_variable
{
	   int a=20;  // use final key for constant variable value
	public void Ab()
	{
         a=a+20;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		Final_variable ob= new Final_variable();
		ob.Ab();
		
	}
}
