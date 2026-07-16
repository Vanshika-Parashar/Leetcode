class Solution {
    public int[] twoSum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]ans={-1,-1};
        for(int i=0;i<nums.length;i++){
            int sub=k-nums[i];
            if(map.containsKey(sub)){
                ans[0]=i;
                ans[1]=map.get(sub);
                return ans;
            }else{
                map.put(nums[i],i);
                
            }
        }
        return ans;
    }
}