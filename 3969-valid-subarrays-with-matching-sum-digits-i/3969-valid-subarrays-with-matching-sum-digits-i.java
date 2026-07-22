class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                if(find(sum+=nums[j],x)){
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
        return (first==x && last==x);
    }
}