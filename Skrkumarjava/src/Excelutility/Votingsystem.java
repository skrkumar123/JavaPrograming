package Excelutility;

import java.util.Scanner;

public class Votingsystem {

public void getname() {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("please enter the name");
	String name =sc.next();
	
}


	public static void getvote() {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("please enter the vailid age");
		
		int age=sc.nextInt();
		if (age >= 18) {
			System.out.println("you are eligible please enter the choice");

			System.out.println("enter 1 for adhaar\nenter2 for voter id");

			int choice = sc.nextInt();
		
			int flag = 0;
			if (choice == 1) {
				System.out.println("please enter adhaar");
				String adhaar = sc.next();

				String path = "C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";

				for (int i = 1; i <= 19; i++) {
					String out = Exceldata.getdata(path, i, 1);

					if (adhaar.equals(out)) {
						System.out.println("Adhaar matched");
						flag = 1;

						System.out.println(
								"please enter the choice for vote\nenter 1 for congress\nenter 2 for bjp\nenter 3 for aap\nenter4 for other");

						int choice1 = sc.nextInt();

						if (choice1 == 1) {
							System.out.println("your vote to congress");

						}

						if (choice1 == 2) {
							System.out.println("your vote to bjp");

						}
						if (choice1 == 3) {
							System.out.println("your vote to aap");

						}
						if (choice1 == 4) {
							System.out.println("your vote to other");

						}

					}

				}
				if (flag == 0) {
					System.out.println(" adhaar not matched");

				}

			}

			int flag1 = 0;
			if (choice == 2)
			{
				System.out.println("please enter voter id");
				String voter = sc.next();

				String path = "C:\\Users\\Sonu\\eclipse-workspace\\12July_newBatch\\Testdata\\testdata.xlsx";

				for (int i = 1; i <= 19; i++) 
				{
					String out = Exceldata.getdata(path, i, 0);

					if (voter.equals(out))
					{
						System.out.println("voterid matched");

						flag1 = 1;

						System.out.println(
								"please enter the choice for vote\nenter 1 for congress\nenter 2 for bjp\nenter 3 for aap\nenter4 for other");

						int choice1 = sc.nextInt();

						if (choice1 == 1) {
							System.out.println("your vote to congress");

						}

						if (choice1 == 2) {
							System.out.println("your vote to bjp");

						}
						if (choice1 == 3) {
							System.out.println("your vote to aap");

						}
						if (choice1 == 4) {
							System.out.println("your vote to other");

						}

					}

				}

				if (flag1 == 0) {
					System.out.println(" voterid not matched");

				}

			}

		} 
		else 
		{
			System.out.println("invailid age ");
	    
	       
	          getvote();
		 	
		}

	}
	
	public static void main(String[] args) {
		Votingsystem ob = new Votingsystem();
		ob.getname();

		getvote();
	}
}
