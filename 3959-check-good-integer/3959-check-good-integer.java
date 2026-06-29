class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sq=0;
        while(n>0){
            int p=n%10;
            sum+=p;
            sq+=p*p;
            n=n/10;
        }
        if(sq-sum>=50)return true;
        return false;
        
    }
}