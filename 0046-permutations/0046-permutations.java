class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       List<Integer>list=new ArrayList<>();
       boolean[]check=new boolean[nums.length];
       return find(nums,list,ans,check);
    }
    public List<List<Integer>> find(int[]nums,List<Integer>list,List<List<Integer>>ans,boolean[]check){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ans;
        }
         //approach 1 checking false;
        // for(int i=0;i<nums.length;i++){
        //     if(check[i]==false){
        //         list.add(nums[i]);
        //         check[i]=true;
        //         find(nums,list,ans,check);
        //         check[i]=false;
        //         list.remove(list.size()-1);
        //     }
        // }
        //more optimised
        
        for (int i = 0; i < nums.length; i++) {
            if (check[i]) continue;
            
            check[i] = true;
            list.add(nums[i]);
            
            find(nums, list, ans, check);
            
            // backtrack
            list.remove(list.size() - 1);
            check[i] = false;

        }
        return ans;
    }
    
}