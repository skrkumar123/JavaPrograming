package ProgramsNew;


// in this inheritance when two or more classes inherit a single class that is called
   //hirerarchical inheritance


 class raja   // parent
 {
	public void getC()
	{
		System.out.println("hello sonu");
	}
 }

  class parka extends raja  //child
{
	public void getB()
	{
		System.out.println("hello parka");
	}
}

public class Hirerarchical_Inheritance  extends raja  //child
{
	
	public void getaA()
	{
		System.out.println("hello hirerachical");
	}
	public static void main(String[] args) {
		Hirerarchical_Inheritance ob=new Hirerarchical_Inheritance();
		ob.getaA();
		ob.getC();
		parka ob1 =new parka();
		ob1.getB();
		ob1.getC();
	}
	

}
