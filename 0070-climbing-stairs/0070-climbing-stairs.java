class Solution {
    public int climbStairs(int n) {
        /**
            n -> the number of stairs
            top = n + 1
            each times 1 or 2 steps
            distinct ways? 
            dynamic programming
            we already know dp[1] = 1, dp[2] = 2
            dp[n] = dp[n-2] + dp[n-1]
            dp[3] = dp[1] + dp[2] = 3 ways
            dp[4] = dp[2] + dp[3] = 5 ways
         */
        // 1 <= n <= 45
        
        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] dp = new int[n+1];

        // base cases
        dp[1] = 1;
        dp[2] = 2;
        // when i is 4, stop and return dp[n](the number of distinct ways)
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];








    }
}