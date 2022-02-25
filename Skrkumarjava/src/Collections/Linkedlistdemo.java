package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public  class Linkedlistdemo {

	
	public static void getdat()  
	{
		LinkedList<Integer> li= new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the records");
		for(int i=0;i<=4;i++)
		{
			li.add(sc.nextInt());
			
		}
		li.remove(2);
		li.addFirst(1);
		
         
for(  Integer dd:li)
		{
			System.out.println(dd);
			
		}
	

	}
	
	public static void main(String[] args) {
        getdat();		
	}
}
