class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
    }
    public void rotate(int []nums,int st,int end){
        while(st<=end){
            int temp=nums[end];
            nums[end]=nums[st];
            nums[st]=temp;
            st++;
            end--;
        }
    }
}
