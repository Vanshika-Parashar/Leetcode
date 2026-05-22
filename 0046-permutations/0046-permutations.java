class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       List<Integer>list=new ArrayList<>();
       boolean[]check=new boolean[nums.length];
       return find(nums,check,ans,list);
    }

    
    public List<List<Integer>> find(int[]nums,boolean[]check,List<List<Integer>>ans, List<Integer>list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i]==true)continue;
            list.add(nums[i]);
            check[i]=true;
            find(nums,check,ans,list);
            list.remove(list.size()-1);
            check[i]=false;
        }
        
        return ans;
    }
    

}