class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(find(sum,x)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean find(long sum,int x){
        if(sum<10 && sum==x)return true;
        int last=(int)(sum%10);
        while(sum>=10){
            sum/=10;
        }
        int first=(int)sum;
        if(first==x && last==x)return true;
        return false;
    }
}