class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        int st=nums[0];
        List<Integer>ans=new ArrayList<>();
        int end=nums[nums.length-1];
        for(int i=st;i<=end;i++){
            if(!num.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}