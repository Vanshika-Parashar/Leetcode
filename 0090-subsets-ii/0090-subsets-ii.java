class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        return subsets(nums,0,l1,ans);
        
    }
    public List<List<Integer>> subsets(int[]nums,int idx,List<Integer>l1,List<List<Integer>>ans){
        ans.add(new ArrayList<>(l1));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            l1.add(nums[i]);
            subsets(nums,i+1,l1,ans);
            l1.remove(l1.size()-1);
        }
        return ans;
    }
}