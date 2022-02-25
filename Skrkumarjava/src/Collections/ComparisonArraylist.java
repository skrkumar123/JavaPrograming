package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparisonArraylist {

	public static void getcompare()
	{
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter 5 names for list");
		for(int i=0;i<=4;i++)
		{
			list.add(sc.next());
		}
		System.out.println("please enter the 5 names for list1");

		for(int i=0;i<=4;i++)
		{
			list1.add(sc.next());
		}
		for(String dd:list)
		{
			for( String dd1:list1)
			{
				if(dd.equals(dd1))
				{
					System.out.println(dd+ "  matched");
				}
				else
				{
					System.out.println(dd+ " not matched");
				}
				list1.remove(0);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		getcompare();
	}
}
