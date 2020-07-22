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
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] binarr = new int[n];
            for(int i = 0; i < n; i++) {
                binarr[i] = scn.nextInt();
            }
            System.out.println(longestSubarray(binarr));
        }
    }
    public static int longestSubarray(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 0;
        prefix[1] = 0;
        for(int i = 2; i < prefix.length; i++) {
            if(nums[i - 2] == 1) {
                prefix[i] = prefix[i - 1] + 1;
            } else {
                prefix[i] = 0;
            }
        }

        suffix[nums.length - 1] = 0;
        suffix[nums.length - 2] = 0;
        for(int i = nums.length - 3; i >= 0; i--) {
            if(nums[i + 2] == 1) {
                suffix[i] = suffix[i + 1] + 1;
            } else {
                suffix[i] = 0;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 1; i++) {
            if(prefix[i + 1] + suffix[i] > max) {
                max = prefix[i + 1] + suffix[i];
            }
        }
        
        return max;
    }
}