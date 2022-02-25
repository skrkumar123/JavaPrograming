package ProgramsNew;

public class ThisDemmo {
	
	int a;
	public ThisDemmo(int a)
	{
	   this.a=a;
	}
	
	public void getA()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisDemmo ob=new ThisDemmo(12);
		ob.getA();
	}
}
