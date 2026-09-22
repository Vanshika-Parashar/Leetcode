class Solution {
    public int countValidSubarrays(int[] nums, int x) {
       int count=0;
       for(int i=0;i<nums.length;i++){
        long sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(isplaindrome(sum,x)){
                count++;
            }
        }
       }
       return count;
    }
    public boolean isplaindrome(long sum,int x){
        
        long last=sum%10;
        
        
    
        while( sum>=10){
            sum=sum/10;
        }
        long first=sum;
        if(last==x && sum==x)return true;
        return false;

    }
}