package ProgramsNew;

class Congress
{
	public void gettax(float num)
	{
		float out=(num*5)/100;
		System.out.println(out);
	}
}
class Bjp extends Congress
{
	public void gettax(float num)
	{
		float out=(num*18)/100;
		System.out.println(out);
	}
}

public class Overriding {
public static void main(String[] args) {
	Bjp ob=new Bjp ();
	ob.gettax(100);
}
}
