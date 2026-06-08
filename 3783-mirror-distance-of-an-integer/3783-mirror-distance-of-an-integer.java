class Solution {
    public int mirrorDistance(int n) {
        int x=n;
        int rev=0;
        int last=0;
        while(x!=0){
            last=x%10;
            rev=(rev*10)+last;
            x=x/10;
        }
        int ans=Math.abs(n-rev);
        return ans;
        
    }
}