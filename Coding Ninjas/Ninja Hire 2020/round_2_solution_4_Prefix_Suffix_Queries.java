import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        long[][] prefixarray = createprefixarray(s);
        long[][] suffixarray = createsuffixarray(s);
        int Q = scn.nextInt();
        while(Q > 0) {
            char ch = scn.next().charAt(0);
            int n_ch = scn.nextInt();
            if(ch == 's') {
                System.out.println(suffixarray[0][s.length() - n_ch]);
            } else {
                System.out.println(prefixarray[6][n_ch]);
            }
            Q--;
        }
    }
    private static long[][] createsuffixarray(String s) {
        String an_string = "ninjas";
        long[][] dp = new long[an_string.length()][s.length() + 1];
        for(int col = dp[0].length - 2; col >= 0; col--) {
            if(s.charAt(col) == 's') {
                dp[5][col] = dp[5][col + 1] + 1;
            } else {
                dp[5][col] = dp[5][col + 1];
            }
        }
        for(int row = 4; row >= 0; row--) {
            for(int col = dp[0].length - 2; col >= 0; col--) {
                if(s.charAt(col) == an_string.charAt(row)) {
                    dp[row][col] = dp[row][col + 1] + dp[row + 1][col + 1];
                } else {
                    dp[row][col] = dp[row][col + 1];
                }
            }
        }
        return dp;
    }
    private static long[][] createprefixarray(String s) {
        String an_string = "ninjas";
        long[][] dp = new long[an_string.length() + 1][s.length() + 1];
        for(int col = 1; col <= dp[0].length - 1; col++) {
            if(an_string.charAt(0) != s.charAt(col - 1)) {
                dp[1][col] = dp[1][col - 1];
            } else {
                dp[1][col] = dp[1][col - 1] + 1;
            }
        }
        for(int row = 2; row <= dp.length - 1; row++) {
            for(int col = 1; col <= dp[0].length - 1; col++) {
                if(an_string.charAt(row - 1) != s.charAt(col - 1)) {
                    dp[row][col] = dp[row][col - 1];
                } else {
                    dp[row][col] = dp[row][col - 1] + dp[row - 1][[col - 1]];
                }
            }
        }
        return dp;
    }
}