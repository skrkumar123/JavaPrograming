package JavaPrograms;

import java.util.Scanner;

public class Question_first {

	
	public void getmarks(int marks)
	{
		int result =0;
		if(marks<33)
		{
			 result=marks+5;
			System.out.println(result);
		}
		else if(marks>33&&marks<50)
		{
			
			if(marks%2==0)
			{
				System.out.println(result);
			}
			else
			{
				result=marks*2;
				System.out.println(result);
			}
		}
		 else if(marks>50&&marks<70)
			{
			 result=marks/2;
				System.out.println(result);
			}
		}
	
	
	public static void main(String[] args) {
		Question_first ob =new Question_first();
		Scanner sc=new Scanner(System.in);
		System.out.println("University rules\nplease enter the marks");
		int result=sc.nextInt();
		ob.getmarks(result);
		sc.close();
	}
}
