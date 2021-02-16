package prog.string.hacker.java.string1;


import java.io.*;
import java.util.*;

//java string reverse
public class Solution13 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String S=new StringBuilder(A).reverse().toString();
        if(S.equals(A))
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}
