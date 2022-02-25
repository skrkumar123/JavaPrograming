package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ComapareInteger {

	public static void getcompare()
	{
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> li1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter 10 value for li");
		for(int i=0;i<=9;i++)
		{
			li.add(sc.nextInt());
		}

		System.out.println("please enter 10 value for li1");
		for(int i=0;i<=9;i++)
		{
			li1.add(sc.nextInt());
		}
        for(  Integer dd:li)
    
        {
        	for(Integer dd1:li1)
        	{
        		if(dd==dd1)
        		{
        			System.out.println(dd+ " matched");
        		}
        		else
        		{
        			System.out.println(dd+" not matched");
        		}
        		li1.remove(0);
        		break;
        	}
        }
		
	}
	
	public static void main(String[] args) {
		getcompare();
	}
}
