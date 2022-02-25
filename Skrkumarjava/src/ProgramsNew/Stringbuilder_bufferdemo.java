package ProgramsNew;

public class Stringbuilder_bufferdemo {

	
	public static void main(String[] args) {
		
	StringBuilder sb=new StringBuilder("sonu");
	StringBuffer sb1=new StringBuffer("sonu");
	
	long starttime =System.currentTimeMillis();
	for (int i=0;i<=1000000;i++)
	{
	sb.append("test");
	}
	long endtime=System.currentTimeMillis();
	System.out.println("strinbuilder time taken"+(endtime-starttime)+" ms");
	
	long start=System.currentTimeMillis();
	for(int i=0;i<=1000000;i++)
	{
		sb1.append("test");
	}
	 endtime=System.currentTimeMillis();
	System.out.println("stringbuffer time taken"+(endtime-starttime)+" ms");
	}
}
