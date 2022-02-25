package JavaPrograms;

import java.util.Scanner;

public class Gst_server 
{

	public float getgst(float input)
	{
		float Gstoutput=(input*18)/100;
		
		return Gstoutput;
	}
	
	public static void main(String[] args)
	{
		Gst_server ob=new Gst_server();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the ammount");
		float input=sc.nextFloat();
		float output=ob.getgst(input);
		System.out.println(output);
	}
}
