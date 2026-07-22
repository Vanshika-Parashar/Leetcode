class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        return find(nums,0,ans,list);
    }
    public List<List<Integer>> find(int[]nums,int idx,List<List<Integer>>ans,List<Integer>list){
        ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            find(nums,i+1,ans,list);
            list.remove(list.size()-1);
        }
        return ans;
    }
}