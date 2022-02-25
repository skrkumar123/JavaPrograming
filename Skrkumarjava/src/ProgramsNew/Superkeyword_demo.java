package ProgramsNew;


class Abcd
{
	int b=20;
}
public class Superkeyword_demo extends Abcd
{
	int b=30;
	public void getdata()
	{
		System.out.println(super.b);
	}
	public static void main(String[] args)
	{
		Superkeyword_demo ob  = new Superkeyword_demo();
		ob.getdata();
	}
}
