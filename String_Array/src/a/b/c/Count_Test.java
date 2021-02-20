package a.b.c;

import java.util.Scanner;

public class Count_Test 
{
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s1=sc.nextLine();
	char arr[]=s1.toCharArray();
	s1="";
	for(int i=0; i<arr.length; i++)
	{
		s1=s1+arr[i];
		
	}
	System.out.println(s1);
	int count=1;
	for(int i=0; i<s1.length()-1; i++)
	{
		if(s1.charAt(i)==s1.charAt(i+1))
		{
			count++;
		}else
		{
			System.out.println(s1.charAt(i)+"="+count);
			count=1;
		}
	}
	int n=s1.length()-1;
	System.out.println(s1.charAt(n)+"="+count);
	}

}
