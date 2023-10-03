class Solution {
    /**
        return how many distinct ways you can reach the top
        able to climb one or two steps at once
        dynamic programming algorithm
        we already know 
        dp[1] = 1, dp[2] = 2
        therefore, dp[3] = dp[1] + dp[2] = 3
        dp[4] = dp[2] + dp[3]
        dp[n] = dp[n-2] + dp[n-1]
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        // if n = 3,
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1]; // dp[3] = dp[1] + dp[2]
        }

        return dp[n];
    }











}