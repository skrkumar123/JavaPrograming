package JavaPrograms;

import java.util.Scanner;

public class SwitchstatementDemoo 
{
	char input;
	public void getvalidateVowel()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		char input = sc.next().charAt(0);
		switch(input)
		{
		case 'a':
		{
			System.out.println("a is a vowel");
			break;
		}
		case 'e':
		{
			System.out.println("e is a vowel");
			break;
		}
		case 'i':
		{
			System.out.println("i is a vowel");
			break;
		}
		case 'o':
		{
			System.out.println("o is a vowel");
			break;
		}
		case 'u':
		{
			System.out.println("U is a vowel");
			break;
		}
		default:
		{
			System.out.println(input+" consonant");
			sc.close();
		}
		}
	}
	
	public static void main(String[] args)
	{
		SwitchstatementDemoo ob = new SwitchstatementDemoo();
		
		ob.getvalidateVowel();
		
	}
}
