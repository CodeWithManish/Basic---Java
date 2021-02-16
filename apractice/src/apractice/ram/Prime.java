package apractice.ram;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=scanner.nextInt();
	System.out.println("Enter the number from 1 "+n);
	for( int i=1; i<n; i++){
		boolean isPrime=true;
		for(int j=2; j<i; j++){
			if(i%j==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(i+" ");
		}
	}
}
}
