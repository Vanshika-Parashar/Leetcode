class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i]-rev(nums[i]);
            if(map.containsKey(ele)){
                count+=map.get(ele);
                count%=1000000007;
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        return count;
    }
    public int rev(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }
}