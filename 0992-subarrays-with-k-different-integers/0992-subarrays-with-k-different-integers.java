class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans=atmost(nums,k)-atmost(nums,k-1);
        return  ans;
        
        
    }
    public int atmost(int[]nums,int k){
        if(k<0)return 0;
        int i=0;
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int j=0;j<n;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0)map.remove(nums[i]);
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
    
}