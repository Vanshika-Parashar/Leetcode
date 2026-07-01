class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && a.contains(-1*nums[i])){
                ans.add(nums[i]);
                
            }
        }
        if(ans.size()==0)return -1;
        int n=Collections.max(ans);
        return n;
        
    }
}