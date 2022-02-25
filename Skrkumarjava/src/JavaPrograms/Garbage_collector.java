package JavaPrograms;

public class Garbage_collector {

	
	public void finalize()
	{
		
		System.out.println("hello garbaze collection");
	}
	
	public static void main(String[] args) {
		
		Garbage_collector ob=new Garbage_collector();
		Garbage_collector ob1=new Garbage_collector();
		ob=null;
		ob1=null;
		System.gc();
	}
}
