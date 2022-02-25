package JavaPrograms;

import java.util.Scanner;

public class Marksheetdemo
{
	
	public void getresult(String name,String clgname,String coursename,String fathername,long rollno)
	{
		System.out.println("*********student details*******");
		System.out.println("student name: "+name);
		System.out.println("clgname: "+clgname);
		System.out.println("course name: "+coursename);
		System.out.println("father name: "+fathername);
		System.out.println("rollno: "+rollno);
		
	}
	public void getmarks(float math,float hindi,float english,float science,float computer)
	{
		System.out.println("******marks***********");
		System.out.println("math marks: "+math);
		System.out.println("hindi marks: "+hindi);
		System.out.println("english marks: "+english);
		System.out.println("science marks: "+science);
		System.out.println("computer marks: "+computer);
		
		
		if(math<33||hindi<33||english<33||science<33||computer<33)
		{
			System.out.println("you are fail");
		}
		else
		{
			float total=math+hindi+english+science+computer;
			float percentage=(total*100)/500;
			if(percentage<=45)
			{
				System.out.println("passed with 3rd div" +percentage);
			}
			else if(percentage>=45&&percentage<60)
			{
				System.out.println("passed with 2ds div "+percentage);
			}
			else
			{
				System.out.println("passed with 1rst div "+percentage);
			}
		}
		
	}
   public static void main(String[] args)
   {
	   Marksheetdemo ob =new Marksheetdemo();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the name");
	   String name=sc.next();
	   System.out.println("enter the clgname");
	   String clgname=sc.next();
	   System.out.println("enter course name"); 
	   String coursename=sc.next();
	   System.out.println("enter father name");
	   String fathername=sc.next();
	   System.out.println("enter rollno");
	   long rollno=sc.nextLong();
	   System.out.println("enter math marks");
	   float math=sc.nextFloat();
	   System.out.println("enter hindi marks");
	   float hindi=sc.nextFloat();
	   System.out.println("enter english marks");
	   float english=sc.nextFloat();
	   System.out.println("enter science marks");
	   float scince=sc.nextFloat();
	   System.out.println("enter computer marks");
	   float computer=sc.nextFloat();
	   ob.getresult(name, clgname, coursename, fathername, rollno);
	   ob.getmarks(math, hindi, english, scince, computer);
	   sc.close();
			   
}
}
