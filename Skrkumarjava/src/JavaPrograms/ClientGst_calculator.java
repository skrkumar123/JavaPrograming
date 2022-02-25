package JavaPrograms;

import java.util.Scanner;

public class ClientGst_calculator
{

	public static void main(String[] args)
	{
		Gst_server ob=new Gst_server();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the ammount");
		float input=sc.nextFloat();
		ob.getgst(input);
		sc.close();
	}
}
