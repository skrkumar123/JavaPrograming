package JavaPrograms;

import java.util.Scanner;

public class Table_loop

{
public void gettable(int number) {
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(number+"*"+i+"="+i*number);
	}
}
	public static void main(String[] args) {
		Table_loop ob =new Table_loop();
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the number");
		int table=sc.nextInt();
		ob.gettable(table);
	}
}
