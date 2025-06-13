class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int str1=text1.length();
        int str2=text2.length();

        int[][] dp=new int[str1+1][str2+1];
        for(int i=1;i<=str1;i++){
            for(int j=1;j<=str2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[str1][str2];
    }
}