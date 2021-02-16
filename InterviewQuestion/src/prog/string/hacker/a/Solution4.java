package prog.string.hacker.a;

import java.util.Scanner;

//loop I
public class Solution4 {
	
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int i;
	        
	        for(i=1; i<=10; i++)
	        {
	        System.out.print(N);
	        System.out.print(" x ");
	        System.out.print(i);
	        System.out.print(" = ");
	        System.out.println(N*i);
	        }
	        scanner.close();
	    }
}
