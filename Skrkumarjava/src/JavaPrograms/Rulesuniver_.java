package JavaPrograms;

import java.util.Scanner;

public class Rulesuniver_ {

	int result =0;
	
	public void getmarks(int marks)
	{
		if(marks<33)
		{
			result=marks+5;
			System.out.println(result);
		}
		
		
	}
	public static void main(String[] args) {
		Rulesuniver_ ob =new Rulesuniver_();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the marks");
		int result =sc.nextInt();
		ob.getmarks(result);
	}
}
