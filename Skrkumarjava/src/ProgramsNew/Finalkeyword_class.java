package ProgramsNew;

 class pawan  // if we use final key here so we can't inherit proerties of class pawan
{
	public void getdata2()
	{
		int a=30;
		System.out.println(a);
	}
}

public class Finalkeyword_class extends pawan {
	
	public void getdata()
	{
		int a=30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Finalkeyword_class ob=new Finalkeyword_class();
		ob.getdata();
		
	}
	
}
