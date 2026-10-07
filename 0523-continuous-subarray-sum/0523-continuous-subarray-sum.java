class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int []pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int ele=pre[i];
            int rem=ele-k;
            if(map.containsKey(rem)){
               int j= map.get(rem);
                if(j-i>=2)return true;
                
            }else{
                map.put(rem,i);
            }

        }
        return false;
            
        
    }
}