package ArrayPrograms;

import java.util.Scanner;

public class Practicearray 

{
	Scanner sc=new Scanner(System.in);
	public void getdata(char input)
	{
		char [] a=new char[10];
		
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
				System.out.println("consonent"+a[k]);
			}
	}
	}
     public static void main(String[] args) {
    	 
    	 Arrayclassdemo ob= new Arrayclassdemo();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("please enter the 10 char");
    	 char input=sc.next().charAt(0);
    	 
    	 ob.getdata();
     }
     }

