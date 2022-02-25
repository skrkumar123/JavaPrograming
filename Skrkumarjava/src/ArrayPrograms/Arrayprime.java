package ArrayPrograms;

import java.util.Scanner;

public class Arrayprime {
	public void get()
	{
		int [] a=new int[5];
				Scanner sc=new Scanner(System.in);
				System.out.println("please enter the 5 number");
				for(int i=0;i<=4;i++)
				{
					a[i]=sc.nextInt();
				}
				for(int j=0;j<=4;j++)
				{
				
				if(a[j]==0||a[j]==1)
				{
					System.out.println("prime num");	
				}
				else
				{
					int flag=0;
					for(int k=2;k<a[j];k++)
					{
						if(a[j]%k==0)
						{
							flag=1;
							System.out.println(a[j]+" not prime");
							break;
						}
					}
					if(flag==0)
					{
						System.out.println(a[j]+" prime");
					}
				}
				}
				
	}
public static void main(String[] args) {
	Arrayprime ob=new Arrayprime();
	ob.get();
}
}
