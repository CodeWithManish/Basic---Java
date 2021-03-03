import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	  // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] array=new int[5];
        for(int i=0; i<arr.size(); i++){
            switch(arr.get(i)){
                case 1: array[0]++;
                break;
                case 2: array[1]++;
                break;
                case 3: array[2]++;
                break;
                case 4: array[3]++;
                break;
                case 5: array[4]++;
                break;
            }
        }
        int highest=0;
        int ans=0;
        for(int i=0; i<5; i++){
            if(array[i]>highest){
                highest=array[i];
                ans=i+1;
            }
        }
        return ans;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
