class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return find(dp,m,n,0,0);

      }
      public int find(int[][]dp,int m,int n,int cr,int cc){
        if(cr>=m || cc>=n)return 0;
        if(cr==m-1 && cc==n-1)return 1;
        if(dp[cr][cc]!=-1)return dp[cr][cc];
        int right=find(dp,m,n,cr,cc+1);
        int down=find(dp,m,n,cr+1,cc);
        return dp[cr][cc]=right+down;
      }
}