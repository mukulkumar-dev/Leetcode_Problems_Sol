class Solution {
   int solveTab(int n ){
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int j=1;j<=n;j++){
            dp[j] = j;
        for(int i=1 ;i*i <= n ; i++){
            if(j - (i*i) >= 0)
            dp[j] = Math.min(dp[j] , 1 + dp[j-(i*i)]);
        }
        }
        return dp[n];
    }

    public int numSquares(int n) {
        return solveTab(n);
    }
}