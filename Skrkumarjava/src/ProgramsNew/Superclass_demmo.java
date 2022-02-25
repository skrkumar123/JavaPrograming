package ProgramsNew;

class prrr //parent 
{

	int b=20;
	public void getdata()
	{
		System.out.println(b);
	}
}
public class Superclass_demmo extends prrr //child
{
	
	int b=40;
	public void getav()
	{
		System.out.println(super.b);
	}
	
	
	public static void main(String[] args) {
		
		Superclass_demmo ob= new Superclass_demmo();
		ob.getav();
	}

}
