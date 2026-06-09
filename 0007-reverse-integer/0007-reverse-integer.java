class Solution {
    public int reverse(int x) {
        long last=0;
        long res=0;
        while(x!=0){
            last=x%10;
            res=(res*10)+last;
            x=x/10;
        }
        
        if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE){
            return 0;
        }
        else{
            return(int)(res);
        }
    }
}