class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            int sub=nums[j]-nums[i];
            if(sub==1){
                max=Math.max(max,j-i+1);
                
            }
            while(nums[j]-nums[i]>1){
                i++;
            }
        }if(max==Integer.MIN_VALUE)return 0;
        return max;
    }
}