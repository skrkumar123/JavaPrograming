package JavaPrograms;

import java.util.Scanner;

public class Greater_no 
{
	public void getnum(int num1,int num2,int num3)
	{
		
	
	if(num1 > num2&&num1 > num3)
	{
		System.out.println("The greatest no. is : "+num1);
		
		
	}
	else if (num2 > num1&&num1 > num3){
		System.out.println("The greatest no. is : "+num2);
	}
	else if(num3 > num1&&num3 > num2)
	{
		System.out.println("The greatest no. is : "+num3);
	}
	}
	public static void main(String[] args) 
	{
		Greater_no  ob=new Greater_no(); 
	   Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("please enter the  three numbers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    ob.getnum(num1, num2, num3);
    sc.close();
		
    
  }
}