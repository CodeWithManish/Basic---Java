package prog.string;


/*write java program to find the frequency of characters in a string 
this program counts the frequency of characters in a string, 1.e,which
character is present how many times  in the string.
*/
import java.util.Scanner;

public class FreqProgram 
{
	public static void main(String[] args) 
	{

	int []a= new int[26];
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)>=65 && str.charAt(i)<=90)
		{
			a[str.charAt(i)-65]++;
		}
		else if(str.charAt(i)>=97 && str.charAt(i)<=122)
		{
			a[str.charAt(i)-97]++;
		}
	}
	for(int i=0; i<26; i++)
	{
		if(a[i]>0)
		{
			System.out.println((char)(i+65)+"-"+a[i]);
		}
	}
 }

}
