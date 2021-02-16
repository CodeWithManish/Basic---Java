package prog.string.hacker.java.string1;

import java.util.*;


//Anagram hack
public class Solution14 {
	 static boolean isAnagram(String a, String b) {
	        int a_length=a.length();
	        int b_length=b.length();

	        if(a_length !=b_length ) return false;

	        a=a.toLowerCase();
	        b=b.toLowerCase();

	        int[] char_frequency= new int[26];
	        for(int i=0; i<a_length; i++)
	        {
	            char current_char=a.charAt(i);
	            int index=current_char-'a';
	            char_frequency[index]++;
	        }

	        for(int i=0; i<b_length; i++)
	        {
	            char current_char=b.charAt(i);
	            int index=current_char-'a';
	            char_frequency[index]--;
	        }

	        for(int i=0; i<26; i++)
	        {
	            if(char_frequency[i] !=0) return false;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
