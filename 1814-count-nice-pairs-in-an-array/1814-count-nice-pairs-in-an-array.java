class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int rem=nums[i]-rev(nums[i]);
            if(map.containsKey(rem)){
                count+=map.get(rem);
                count=count%1000000007;
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
           
        }
         return count;
    }
        public int rev(int n){
            int rem=0;
            while(n!=0){
                int p=n%10;
                rem=rem*10+p;
                n=n/10;
            }
             return rem;
        }
       
 }
