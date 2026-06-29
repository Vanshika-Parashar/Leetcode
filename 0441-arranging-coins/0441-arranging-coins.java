class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        while(n>0){
            if(n-i>0){
                n=n-i;
                i++;
            }
            else if(n-i==0)return i;
            else{
                return i-1;
            }
        }
        return 0;
    }
}