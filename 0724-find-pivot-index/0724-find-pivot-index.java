class Solution {
    public int pivotIndex(int[] nums) {
        int[]pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int n=pre.length;
        if(pre[n-1]-pre[0]==0)return 0;
        for(int i=1;i<nums.length;i++){
            int left=pre[i-1];
            int right=pre[n-1]-pre[i];
            if(left==right)return i;
        }
        return -1;
    }
}