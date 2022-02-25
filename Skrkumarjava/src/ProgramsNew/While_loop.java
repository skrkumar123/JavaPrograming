package ProgramsNew;

import java.util.Scanner;

public class While_loop {
	
	public  void gettable(int num){
	int i=1;
	while(i<=10)
	{
		System.out.println(num+"*"+i+"="+num*i);
		i++;
	}
	}
	public static void main(String[] args) {
	
		While_loop ob=new While_loop();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the num");
		int num=sc.nextInt();
		ob.gettable(num);
	
	}
}
