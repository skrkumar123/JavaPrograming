package ProgramsNew;

class abc
{
	public void getA()
	{
		System.out.println("helllo abc");
	}
}
class xyz extends abc
{
	 public void getB()
	 {
		 System.out.println("hello xyz");
	 }
}
class pqr extends abc 
{
	public void getC()
	{
		System.out.println("hello pqr");
	}
}

public class Hybrid_inheritance  extends  xyz {
	
	public void getD()
	{
		System.out.println("hello hybrid");
	}

	public static void main(String[] args) 
	{
		Hybrid_inheritance ob =new Hybrid_inheritance();
				ob.getA();
				ob.getB();
				ob.getD();
				pqr ob1=new pqr();
				ob1.getA();
				ob1.getC();
				xyz ob2=new xyz();
				ob2.getA();
				ob2.getB();
	}
}
