class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int num1=nums[n-1];
        int nums2=nums[n-2];
        int mul=(num1-1)*(nums2-1);
        return mul;
    }
}