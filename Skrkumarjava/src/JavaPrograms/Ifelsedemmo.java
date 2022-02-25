package JavaPrograms;

import java.util.Scanner;

public class Ifelsedemmo 

{
   public void getvalidate(int age)
 {
	if(age>=18)
	{
		System.out.println("you are eligible");
		
	}
	
	else
	{
		System.out.println("you are not eligibe");
	}
}
	
	public static void main(String[] args) 
	{
		Ifelsedemmo  ob=new Ifelsedemmo ();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the value");
		int input =sc.nextInt();
		ob.getvalidate(input);
		sc.close();
	}
}
