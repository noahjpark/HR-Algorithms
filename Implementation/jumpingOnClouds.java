// Jumping On Clouds Problem
// Github: github.com/noahjpark

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        int i = 0;
        while(i < c.length - 1){
            if(i < c.length - 2 && c[i + 2] != 1){
                i += 2;
                minJumps++;
            }
            else if(i < c.length - 1 && c[i + 1] != 1){
                i += 1;
                minJumps++;
            }
        }
        return minJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] c = new int[n];
        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = jumpingOnClouds(c);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
