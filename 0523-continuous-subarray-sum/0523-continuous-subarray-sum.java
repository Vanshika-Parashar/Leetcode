class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[]prefix=new int[nums.length];
        prefix[0]=nums[0];
        int n=nums.length;
        int sum=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            //sum+=nums[i];
            int rem=prefix[i]%k;
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
            else{
                int idx=map.get(rem);
                if(i-idx>=2)return true;
            }
        }
        return false;
    }
}