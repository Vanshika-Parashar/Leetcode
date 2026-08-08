class Solution {
    public int countSquares(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][]dp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0){
                    dp[i][j]=matrix[i][j];
                }
                else{
                    if(matrix[i][j]!=1)continue;
                    int n=Math.min(dp[i-1][j],dp[i][j-1]);
                    int min=Math.min(n,dp[i-1][j-1]);
                    dp[i][j]=1+min;
                }
            }
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                count+=dp[i][j];
            }
        }
        return count;
    }
}