package ProgramsNew;

class prince
{
	public prince(int a,int b)
	{
		System.out.println("hello prince");
	}
}

public class Super_constructer extends prince

{
  public  Super_constructer(int a,int b)
  {
	  super(a,b);
	  System.out.println("helllo super constructer");
	
}
public static void main(String[] args) {
	
	Super_constructer ob=new Super_constructer(12,24);
	
}
}

