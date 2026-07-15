class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      int i=0;
      for(int j=0;j<nums.length;j++){
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        while(j-i>k){
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0)map.remove(nums[i]);
            i++;
        }
        if(map.get(nums[j])==2)return true;
      }
      return false;
            
            
        
    }
}