package JavaPrograms;

import java.util.Scanner;

public class Marksheet_clg 
{

	public void getdetails(String name,String course,String clgname)
	{
		System.out.println("*******Student details**********");
		System.out.println("student name- "+name);
		System.out.println("student course- "+course);
		System.out.println("Student college name- "+clgname);
		
	}
	
	public void getmarks(float math,float hindi,float science,float english,float computer)
	{
		System.out.println("--------Marks--------");
	    System.out.println("math marks -"+math);
	    System.out.println("hindi marks- "+hindi);
	    System.out.println("science marks- "+science);
	    System.out.println("english marks- "+english);
	    System.out.println("computer marks- "+computer);
	    float total=(math+hindi+science+english+computer);
	    System.out.println("total marks- "+total );
	    float percentage=(total*100)/500;
	    System.out.println("___________________________________");
	    System.out.println("your percentage- "+percentage);
		System.out.println("___________________________________");
	}
	public static void main(String[] args)
	{
		Marksheet_clg  ob=new Marksheet_clg ();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter student name");
		String name=sc.nextLine();
		System.out.println("enter student course");
		String course=sc.next();
		System.out.println("enter college name");
		String clgname=sc.next();
		System.out.println("enter math marks");
		float math=sc.nextInt();
		System.out.println("enter hindi marks");
		float hindi=sc.nextInt();
		System.out.println("enter scinece narks");
		float scince=sc.nextInt();
		System.out.println("enter english marks");
		float english=sc.nextInt();
		System.out.println("enter computer marks");
		float computer=sc.nextInt();
		ob.getdetails(name, course, clgname);
		ob.getmarks(math, hindi, scince, english, computer);
		sc.close();
	    		
	}
}
