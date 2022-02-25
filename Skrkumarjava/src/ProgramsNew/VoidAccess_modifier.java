package ProgramsNew;

public class VoidAccess_modifier {

 void getdata()
 {
	 System.out.println("hello sonu");
 }
	
	public static void main(String[] args) {
		 VoidAccess_modifier ob=new  VoidAccess_modifier();
		 ob.getdata();
	}
}
// we can use void in same class or same package only 
// we cant acces one package to another void methods