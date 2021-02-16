
//write a java program to reverse the string without using method
package prog.string;
public class ReverseString 
{
	public static String WordInReverse(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		String Rev= sb.reverse().toString();
		
		String[] words=Rev.split(" ");
		StringBuilder reverse=new StringBuilder();
		
		for(String temp: words){
		sb=new StringBuilder(temp);
		
		reverse.append(sb.reverse()+" ");
		}
		
		reverse.deleteCharAt(reverse.length()-1);
		return reverse.toString();
		
	}
	
	public static void main(String[] args) 
	{
		String str="this is my word";
		System.out.println("This is String : "+str);
		System.out.println("The new string after reversed the "
				+ "words : "+WordInReverse(str));
		
	}

}



