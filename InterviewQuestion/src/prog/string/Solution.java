package prog.string;

import java.util.Scanner;

public class Solution {
	// Complete the compareTriplets function below.
    public static final int size=3;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arrayList[]=new int[size];
        int arrayList2[]=new int[size];

        for(int i=0; i<size; i++)
        {
            arrayList[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++)
        {
            arrayList2[i]=sc.nextInt();
        }

       int arrayScore=0;
       int array2Score=0;

       for(int i=0; i<size; i++)
       {
           if(arrayList[i]>arrayList2[i])
           {
              arrayScore++; 
           }
           else if(arrayList2[i] > arrayList[i])
           {
            array2Score++;
           }
       }
       System.out.println(arrayScore + " " + array2Score);
    }

}
