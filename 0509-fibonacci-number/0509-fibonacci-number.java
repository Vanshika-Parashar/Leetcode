class Solution {
    public int fib(int n) {
       int[]dp=new int[n+1];
       Arrays.fill(dp,-1);
       return find(dp,n);
    }
    public int find(int[]dp,int n){
        if(n<=1)return n ;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=find(dp,n-1)+find(dp,n-2);
    }
    
}