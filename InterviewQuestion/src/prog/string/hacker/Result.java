package prog.string.hacker;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Result 
{
	
	 /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr)
    {
        
    int LtoR=0;
    int RtoL=0;
    
    int rows=arr.length;
    int  col=arr[0].length;
    int i=0;
    int j=0;
    int k=0;
    int l=arr.length-1;
    
    while(i<rows && j<col && k<rows && l>=0){
    	LtoR +=arr[i][j];
    	RtoL +=arr[k][l];
    	i +=1;
    	j +=1;
    	k +=1;
    }
    return Math.abs(LtoR - RtoL);

    }

}


