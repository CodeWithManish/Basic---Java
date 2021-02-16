package prog.string.hacker.java.string1;
import java.io.*;
import java.util.*;

//string tokens hack
public class Solution15 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        scan.close();

         s=s.trim();
        if(s.length() == 0)
        {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for(String s1 : words)
            System.out.println(s1);
    }
}
