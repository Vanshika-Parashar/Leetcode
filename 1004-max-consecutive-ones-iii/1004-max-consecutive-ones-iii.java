class Solution {
    public int longestOnes(int[] nums, int k) {
        int nk=0;
        int count=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                nk++;
            }
            while(nk>k){
                if(nums[i]==0)nk--;
                i++;
            }
            count=Math.max(count,j-i+1);
        }
        return count;
        
    }
}