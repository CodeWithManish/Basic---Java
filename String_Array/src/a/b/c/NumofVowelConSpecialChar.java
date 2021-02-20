package a.b.c;

import java.util.Scanner;

public class NumofVowelConSpecialChar
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s1=sc.nextLine();
		int vol=0, cons=0, num=0, space=0, spec=0;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||
					s1.charAt(i)=='I'||s1.charAt(i)=='O'||
					s1.charAt(i)=='U'||s1.charAt(i)=='a'||s1.charAt(i)=='e'||
					s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				vol++;
			}
			else if((s1.charAt(i)>=65 && s1.charAt(i)<=90)||
			(s1.charAt(i)>=97 && s1.charAt(i)<=122))
			{
				cons++;
			}
			else if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
			{
				num++;
			}
			else if(s1.charAt(i)==' ')
			{
			   space++;
			}
			else
			{
				spec++;
			}
				
		}
		System.out.println("vowels ="+vol);
		System.out.println("consonent ="+cons);
		System.out.println("number ="+num);
		System.out.println("space ="+space);
		System.out.println("specila character ="+spec);
		
	}

}
