class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return find(dp,m,n,0,0,grid);

    }
    public int find(int[][]dp,int m,int n,int cr,int cc,int[][]grid){
        if(cr>=m || cc>=n)return Integer.MAX_VALUE;
        if(cr==m-1 && cc==n-1)return grid[cr][cc];
        if(dp[cr][cc]!=-1)return dp[cr][cc];
        int right=find(dp,m,n,cr,cc+1,grid);
        int down=find(dp,m,n,cr+1,cc,grid);
        return dp[cr][cc]=grid[cr][cc]+Math.min(right,down);
    }
}