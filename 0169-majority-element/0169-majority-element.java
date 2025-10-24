class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int max=nums[0];
        Arrays.sort(nums);
        int sum=1;
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]){
                sum++;
            }
            else{
                sum=1;
                max=nums[i];

        }
        if(sum>n){
            return nums[i];
        }
        

        
    }
    return max;
    // HashMap<Integer,Integer>h=new HashMap<>();
    // Set<Integer>s=new HashSet<>();
    // for(int i:nums){
    //     s.add(i);
    // }
    // for(int i:nums){
    //     if(h.containsKey(i)){
    //         h.put(i,h.get(i)+1);
    //     }
    //     else{
    //         h.put(i,1);
    //     }
    // }
    // int max=0;
    // for(int i:s){
    //     if(h.get(i)>n){
    //         return i;
    //     }
        

    // }
    // return -1;

}
}