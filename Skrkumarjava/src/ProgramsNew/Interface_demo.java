package ProgramsNew;

interface RBI
{
	public int ROI();
	public int repRate();
}

class Axisbank implements RBI
{

	@Override
	public int ROI() 
	{
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int repRate() {
		// TODO Auto-generated method stub
		return 8;
	}
	
	public int HomeLoan()
	{
		return 6;
	}
	
}

class ICICI implements RBI
{

	@Override
	public int ROI() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public int repRate() {
		// TODO Auto-generated method stub
		return 7;
	}
	public int HomeLoan()
	{
		return 5;
	}
}
public class Interface_demo
{
	public static void main(String[] args) {
		Axisbank ob = new  Axisbank();
		System.out.println("Rate of intrest "+ob.ROI());
		System.out.println("repo rate is "+ob.repRate());
		System.out.println("home loan is "+ob.HomeLoan());
	}
}
