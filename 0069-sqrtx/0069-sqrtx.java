class Solution {
    public int mySqrt(int n) {
        int st=0;
        int end=n;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((long)mid*mid==(long)n)return mid;
        
            else if((long)mid * mid>(long)n){
            end=mid-1;
            }
            else{
            st=mid+1;
            }
        }
        return Math.round(end);
        
    }
}