class Solution {
    public int[] twoSum(int[] nums, int k) {
        HashMap<Integer,Integer>n=new HashMap<>();
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int x=k-nums[i];
            if(n.containsKey(x)){
                ans[0]=i;
                ans[1]=n.get(x);
                break;
            }
            n.put(nums[i],i);
        }
        return ans;
        
    }
}