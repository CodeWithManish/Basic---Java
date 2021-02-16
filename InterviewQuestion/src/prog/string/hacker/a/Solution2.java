package prog.string.hacker.a;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the words");
        int i = scan.nextInt();
        double d = scan.nextDouble();
            String s = scan.nextLine();
            if(s.isEmpty())
            {
            	s=scan.nextLine();
            }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
