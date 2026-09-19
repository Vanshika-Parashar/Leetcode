class Solution {
    public int removeDuplicates(int[] nums) {
        // LinkedHashSet<Integer>l=new LinkedHashSet<>();
        // for(int i:nums){
        //     l.add(i);
        // }
        // int k=0;
        // for(int i:l){
        //     nums[k]=i;
        //     k++;
        // }
        // return k;

        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;

            }
        }
        return j;
        




        

        
    }
}