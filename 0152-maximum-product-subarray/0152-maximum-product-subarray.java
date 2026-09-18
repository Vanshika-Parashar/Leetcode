class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxf=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=i;j<n;j++){
                pro*=nums[j];
                max=Math.max(pro,max);
            }
            maxf=Math.max(max,maxf);
        }
        return maxf;
    }
}