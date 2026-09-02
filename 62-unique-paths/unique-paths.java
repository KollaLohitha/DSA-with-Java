class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return help(m-1,n-1,dp);
    }
    public int help(int r, int c, int[][] dp){
        if(r==-1 || c==-1){
            return 0;
        }
        if(r==0 && c==0){
            return 1;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        return dp[r][c] = help(r,c-1,dp) + help(r-1,c,dp);
    }
}