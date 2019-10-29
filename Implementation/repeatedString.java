// Repeated String Problem
// Github: github.com/noahjpark

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static long repeatedString(String s, long n) {
        if(s.length() == 1 && s.charAt(0) == 'a'){
            return n;
        }
        long numAs = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(count) == 'a'){
                numAs++;
            }

            if(count == s.length() - 1){
                count = 0;
            }
            else{
                count++;
            }
        }
        return numAs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long result = repeatedString(s, n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
