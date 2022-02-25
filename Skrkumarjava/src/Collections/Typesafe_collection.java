package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Typesafe_collection {

	
	static void getverify() {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the  records");
		
		for(int i=0;i<=4;i++)
		{
			list.add(sc.nextInt());

		}
		for(Integer dd:list)
		{
			System.out.println(dd);
		}
	}
	public static void main(String[] args) {
		getverify();
	}
}
