package Excelutility;

import java.util.Scanner;

public class Votedsm {

	public static void getvotesm()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the name");
		String name =sc.next();
		System.out.println("please enter the age");
		int age =sc.nextInt();
		if (age>=18)
		{
			
			System.out.println("you are eligible to vote\nplease enter the choice for vote");
			System.out.println("enter 1 for adhaar\nenter 2 for voter id");
			int choice=sc.nextInt();
			
			boolean flag=false;
			if (choice==1)
			{
				System.out.println("please enterthe adhaar");
				
				String adhaar=sc.next();
				
				String path="C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";
			for(int i=1;i<=19;i++)
			{
				String out=Exceldata.getdata(path, i, 1);
				
				if (adhaar.equals(out))
				{
					
					flag=true;
					System.out.println("congrats adharr is matched\nplease enter for choice to five vote");
					System.out.println("enter 1 for aap\nenter 2 for bjp\nenter 3 for sp");
					int choice1=sc.nextInt();
					
					if(choice1==1)
						
					{
						System.out.println("your vote to aap");
					}
					if (choice1==2)
					{
						System.out.println("your vote to bjp");
						
					}
					if (choice==3)
					{
						System.out.println("your vote to sp");
					}
				}
			}
			     
		if (flag==false)
		{
			System.out.println("adhar not matched");
			
			
		}
			
				
			}
			
			if (choice==2)
			{
				
               System.out.println("please enterthe voter");
				
				String voter=sc.next();
				
				String path="C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";
			for(int i=1;i<=19;i++)
			{
				String out=Exceldata.getdata(path, i, 0);
				
				if (voter.equals(out))
				{
					
					flag=true;
					System.out.println("congrats adharr is matched\nplease enter for choice to five vote");
					System.out.println("enter 1 for aap\nenter 2 for bjp\nenter 3 for sp");
					int choice1=sc.nextInt();
					
					if(choice1==1)
						
					{
						System.out.println("your vote to aap");
					}
					if (choice1==2)
					{
						System.out.println("your vote to bjp");
						
					}
					if (choice==3)
					{
						System.out.println("your vote to sp");
					}
				
			}
			
			}
			}
			}
		
		else
		{
			System.out.println("invalid age please renter");
			getvotesm();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		getvotesm();
	}
}
