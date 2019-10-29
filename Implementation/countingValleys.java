// Counting Valleys Problem
// Github: github.com/noahjpark

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int countingValleys(int n, String s) {
        int numValleys = 0;
        int curVal = 0;
        boolean add = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                curVal++;
            }
            else if(s.charAt(i) == 'D'){
                curVal--;
            }
            if(curVal == -1 && s.charAt(i) == 'D'){
                add = true;
            }
            if(add == true){
                numValleys++;
                add = false;
            }
        }
        return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        int result = countingValleys(n, s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
