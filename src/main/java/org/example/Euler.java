package org.example;

// project Euler 31
public class Euler {
    public static void main(String[] args) {

        int target = 200;
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};

        long[] dp = new long[target + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int sum = coin; sum <= target; sum++) {
                dp[sum] += dp[sum - coin];
            }
        }

        System.out.println(dp[target]);
    }
}