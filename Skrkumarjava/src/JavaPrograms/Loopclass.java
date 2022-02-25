package JavaPrograms;

import java.util.Scanner;

public class Loopclass 
{
public void getverify(int num)
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		 Loopclass ob=new Loopclass();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("please enter the table");
		 int table=sc.nextInt();
		 ob.getverify(table);
		 sc.close();
	}
}
