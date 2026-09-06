class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i]-rev(nums[i]);
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                count+=freq;
                count%=1000000007;
                map.put(ele,freq+1);
            }else{
                map.put(ele,1);
            }
        }
        return count;

    }
    public int rev(int n){
        int rem=0;
        while(n>0){
            int p=n%10;
            rem=rem*10+p;
            n/=10;
        }
        return rem;
    }
       
 }
