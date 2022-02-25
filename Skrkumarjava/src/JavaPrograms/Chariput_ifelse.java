package JavaPrograms;

import java.util.Scanner;

public class Chariput_ifelse 
{
	
	public void getdata(char input)
	{
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
		{
			System.out.println("a is a vowel");
				}
		
		else {
			System.out.println(input+ " is a consonant");
		}
	}
	
public static void main(String[] args) {
	Chariput_ifelse  ob=new Chariput_ifelse ();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the character");
	char input=sc.next().charAt(0);
	ob.getdata(input);
	sc.close();
}
}
