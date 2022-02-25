
package ArrayPrograms;

import java.util.Scanner;

public class SentenceReverse
{

	public void getreverse(String input)
	{
		String[] s=input.split(" ");
		String out="";
		for(int i=0;i<=s.length-1;i++)
		{
			char[] c = s[i].toCharArray();
			for(int k=c.length-1;k>=0;k--)
			{
				out=out+c[k];
			}
			out=out+" ";
		}
		System.out.println(out);

	}
	
	public static void main(String[] args)
	{
		SentenceReverse ob= new SentenceReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = sc.nextLine();
		ob.getreverse(input);
	}
}