package ArrayPrograms;

import java.util.Scanner;

public class Arrayclassdemo 

{
	
	public void getdata()
	{
		char [] a=new char[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the 10 char");
		for(int j=0;j<=9;j++)
		{
		a[j]=sc.next().charAt(0);
		}
		for(int k=0;k<=9;k++)
		{
			if(a[k]=='a' ||a[k]=='e'||a[k]=='i'||a[k]=='o'||a[k]=='u')
			{
				System.out.println("vowel  "+a[k]);
			}
			else
			{
				System.err.println("consonent"+a[k]);
			}
	}
	}
     public static void main(String[] args) {
    	 
    	 Arrayclassdemo ob= new Arrayclassdemo();
    	 ob.getdata();
     }
     }

