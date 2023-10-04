class Solution {
    public int fib(int n) {
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int[] dp = new int[n + 1];
        // F(0) = 0, F(1) = 1
        dp[0] = 0;
        dp[1] = 1;
        // dp[2] = dp[0] + dp[1]
        dp[2] = 1;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}