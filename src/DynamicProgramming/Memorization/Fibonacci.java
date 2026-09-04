package DynamicProgramming.Memorization;

import java.util.Arrays;

public class Fibonacci {
    static double fibonacci(int n, double[] dp) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            //step 3 - check if answer exists
            if(dp[n] != -1){
                return dp[n];
            }
            //step 2 - don't return, first store
            dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
            return dp[n];
        }
    }

    public static void main(String[] args) {
        int n = 100;
        //step 1 - create dp array
        double[] dp = new double[ n];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, dp) + " ");
        }
    }
}
