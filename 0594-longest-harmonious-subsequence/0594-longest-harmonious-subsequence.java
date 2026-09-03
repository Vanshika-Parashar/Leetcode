class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=1;j<nums.length;j++){
           int sub=nums[j]-nums[i];
           while(sub>1){
            i++;
            sub=nums[j]-nums[i];
           }
           if(sub==1){
            max=Math.max(max,j-i+1);
           }
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
        
    }
}