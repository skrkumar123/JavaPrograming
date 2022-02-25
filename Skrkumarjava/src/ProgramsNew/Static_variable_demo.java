package ProgramsNew;

public class Static_variable_demo {

	static int count=20;
	 public  Static_variable_demo()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Static_variable_demo ob=new Static_variable_demo();
		Static_variable_demo ob1=new Static_variable_demo();
		Static_variable_demo ob2=new Static_variable_demo();
		
	}
}
