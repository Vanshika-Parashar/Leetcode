class Solution {
    public List<List<Integer>> combine(int n, int k) {
   
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        return find(nums,k,0,0,ans,list);
    }

    public List<List<Integer>> find(int[]nums,int k,int idx,int count,List<List<Integer>>ans,List<Integer>list){
        if(count==k){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
            find(nums,k,i+1,count+1,ans,list);
            list.remove(list.size()-1);
        }
        return ans;
    }
}