package ProgramsNew;

public class Encapsulation {
	
	
	private String name;
	private String collegename;
	private String coursename;
	
	private int rollno;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCollegename() {
		return collegename;
	}



	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}



	public String getCoursename() {
		return coursename;
	}



	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public static void main(String[] args) {
		
		Encapsulation ob=new Encapsulation();
		ob.setName("sonu");
		ob.setCollegename("vits");
		ob.setCoursename("diploma");
		ob.setRollno(12345);
		System.out.println(ob.getName()+"\n"+ob.getCollegename()+"\n"+ob.getCoursename()+"\n"+ob.getRollno());
		
	}
	
	
}
