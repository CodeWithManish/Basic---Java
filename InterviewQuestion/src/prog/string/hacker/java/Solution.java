package prog.string.hacker.java;

import java.io.*;
import java.util.*;

//java string introduction hackerrank solution

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int Alength=A.length();
        int Blength=B.length();
        System.out.println(Alength+Blength);

        int result=A.compareTo(B);

        if(result > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

        
    }
}