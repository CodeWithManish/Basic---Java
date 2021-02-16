package prog.string.hacker.warmup.time;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String[] parts=s.split(":");
         int hour =Integer.parseInt(parts[0]);
         int min =Integer.parseInt(parts[1]);
         String last=parts[parts.length-1];
         int sec =Integer.parseInt(last.substring(0, last.length()/2));
         String amPm=last.substring(last.length()/2, last.length());

         String military="";
         if(amPm.compareTo("PM")==0){
             military = String.format("%02d:%02d:%02d", (hour+12),min,sec);
             if(hour == 12)
             
                 military = String.format("%02d:%02d:%02d", hour,min,sec);
             
             
         }if(amPm.compareTo("AM")==0){
             military = String.format("%02d:%02d:%02d", (hour-12),min,sec);
             if(hour < 12)
             
                 military = String.format("%02d:%02d:%02d", hour,min,sec);
             
             
         }
         return military;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

