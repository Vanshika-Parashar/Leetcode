class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        List<List<Integer>>allsubsets=new ArrayList<>();
        all(nums,0,ans,allsubsets);
        return allsubsets;
    }
    public List<List<Integer>> all(int[]nums,int idx,ArrayList<Integer>l1,List<List<Integer>>ans){
       ans.add(new ArrayList<>(l1));
        for(int i=idx;i<nums.length;i++){
            l1.add(nums[i]);
            all(nums,i+1,l1,ans);
            l1.remove(l1.size()-1);
        }
       
        return ans;
    }
}