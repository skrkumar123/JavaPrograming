package JavaPrograms;

import java.util.Scanner;

public class Switchdemmo 

{
	public void getvalidate(char input)
	{
		switch(input)
		{
		case 'a':{
		
			System.out.println("a is a vowel");
			break;
		}
		case 'e':
		{
			System.out.println("b is a vowel");
			break;
		}
		case 'i':
		{
			System.out.println("i is a vowel");
		}
		default:
		{
			System.out.println(input+ "ia aconsonant");
		}
		}
	}
public static void main(String[] args) {
	Switchdemmo ob=new Switchdemmo ();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the cahacter");
	char input=sc.next().charAt(0);
	ob.getvalidate(input);
}
}
