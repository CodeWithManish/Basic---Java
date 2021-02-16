package prog.string.hacker.regularex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//regularExpression 0 to 255
public class Solution17 {
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
}
