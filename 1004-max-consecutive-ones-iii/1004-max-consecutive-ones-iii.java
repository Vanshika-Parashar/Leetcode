class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int count=0;
        int nk=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                nk++;
            }
            while(nk>k){
                if(nums[i]==0){
                    nk--;
                }
                i++;

            }
            count=Math.max(j-i+1,count);
        }
        return count;
        
    }
}