class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int count=0;

        for(int i=0;i<nums.length;i++){
            int ele=pre[i];
            if(ele==k)count++;
            int rem=ele-k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        return count;
    }
}