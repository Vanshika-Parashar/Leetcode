class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            int ans=reverse(i);
            set.add(ans);
        }
        return set.size();
    }
    public int reverse(int nums){
        int ans=0;
        while(nums!=0){
            int p=nums%10;
            ans=ans*10+p;
            nums=nums/10;
        }
        return ans;
    }
}