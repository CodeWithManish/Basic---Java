 package a.b.c;

import java.util.Scanner;

public class Palindrome_Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of palindrome:");
		String s1=sc.nextLine();
		String s2=s1;
		char arr[]=s1.toCharArray();
		for(int i=0,j=s1.length()-1; i<j; i++, j--)
		{
			char t= arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		s1="";
		for(int i=0; i<arr.length; i++)
		{
			s1=s1+arr[i];
		}
		System.out.println(s1);
		
		if(s1.equals(s2))
		{
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");
 		}
		
		
	}

}
