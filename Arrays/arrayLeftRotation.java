// Array: Left Rotation Problem
// Github: github.com/noahjpark

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int[] rotLeft(int[] a, int d) {
        if(d == 0){     //no rotations
            return a;
        }
        int temp;       //rotate using temporary holding variables and a trailing index to keep track of the previous value's index
        int temp2;
        int trailingIndex;
        for(int i = 0; i < d; i++){
            int initial = a[0];
            for(int j = 1; j < a.length; j++){
                trailingIndex = j - 1;
                temp = a[trailingIndex];
                temp2 = a[j];
                a[trailingIndex] = temp2;
            }
            a[a.length - 1] = initial;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        } 
        
        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
