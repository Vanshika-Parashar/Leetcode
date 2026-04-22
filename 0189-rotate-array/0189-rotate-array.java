class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        int n=nums.length;
        rotate(0,n-1,nums);
        rotate(0,k-1,nums);
        rotate(k,n-1,nums);
    }
    public void rotate(int st,int end ,int[]nums){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
}
