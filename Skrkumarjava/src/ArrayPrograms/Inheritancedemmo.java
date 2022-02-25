package ArrayPrograms;

 class AB //parents class 
 
 {
		int b=40;
	 public void getdata()
	 {
		 System.out.println("sonu");
	 }
 }

public class Inheritancedemmo extends AB {
	//child class
	public void getdetails()
	{
		System.out.println("sonu rajput");
	}
	
	

	public static void main(String[] args) {
		Inheritancedemmo ob=new Inheritancedemmo();
		ob.getdetails();
		ob.getdata();
		System.out.println(ob.b);
		
	}
}
