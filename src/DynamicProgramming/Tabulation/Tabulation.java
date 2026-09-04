package DynamicProgramming.Tabulation;

import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        int n = 100;
        //step 1
        double[] dp  = new double[n];

        //step 2 - initialize the forts 2 terms
        dp[0] = 0;
        dp[1] = 1;

        //step 3 - create a loop
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        //step 4 - print
        System.out.println(Arrays.toString(dp));

    }
}
