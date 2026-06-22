class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(ischeck(sum,x)){
                    count++;
                    
                }
            }
        }
        return count;
    }
    public boolean ischeck(long n,int x){
        long first=n;
        int last=(int)(n%10);
        
        while(first>=10){
            first=first/10;
        }
        first=(int)first;
        return first==x && last==x;

    }
}