package ProgramsNew;

public class Call_Encapsulation {

	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();
		ob.setName("sonu");
		ob.setCollegename("vits");
		ob.setCoursename("diploma");
		ob.setRollno(12345);
		System.out.println(ob.getName()+"\n"+ob.getCollegename()+"\n"+ob.getCoursename()+"\n"+ob.getRollno());
	}
}
