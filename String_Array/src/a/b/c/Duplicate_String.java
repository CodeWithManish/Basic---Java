package a.b.c;

import java.util.Scanner;

public class Duplicate_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		String st=sc.nextLine();
		String s1="";
		int i=0;
		while(i<st.length()-1)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				i++;
			}
			else
			{
				s1=s1+st.charAt(i);
				i++;
			}
			
		}
		System.out.println(s1);
	}

}
