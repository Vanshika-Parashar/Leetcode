class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int ans=0;
        for(int i:nums){
            if(freq==0)ans=i;
            if(ans==i){
                freq++;

            }else{
                freq--;
            }
        }
        return ans;
}
}