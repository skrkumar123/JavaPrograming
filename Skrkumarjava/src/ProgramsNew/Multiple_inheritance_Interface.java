package ProgramsNew;
interface sima
{
	public void getS();
}
interface Abhishek
{
	public void getA();
}

public class Multiple_inheritance_Interface implements sima,Abhishek
{

	@Override
	public void getA() {
		// TODO Auto-generated method stub
		System.out.println("Abhishek");
		
	}

	@Override
	public void getS() {
		// TODO Auto-generated method stub
		System.out.println("sima");
		
	}
 public static void main(String[] args) {
	 Multiple_inheritance_Interface ob=new Multiple_inheritance_Interface();
	 ob.getA();
	 ob.getS();
}
	
}
	
		
	

