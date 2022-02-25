package ProgramsNew;


abstract class Cardemmo  //it can achive abstraction 0  to 100
{
	 public int wheel()
	 {
		return 4;
		 
	 }
	abstract public String color();
	abstract public int seat();
	abstract public int price();
}
class Hundayi extends Cardemmo

{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public int seat() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 1000000;
	}
	
}

class Maruti extends Cardemmo
{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public int seat() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 500000;
	}
	
}
public class Abstractclass {
	
	
public static void main(String[] args) {
	Maruti m=new Maruti();
	System.out.println(m.wheel());
	System.out.println(m.color());
	System.out.println(m.price());
	System.out.println(m.seat());
}
}
