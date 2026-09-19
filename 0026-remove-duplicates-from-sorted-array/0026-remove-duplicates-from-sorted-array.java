class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>l=new LinkedHashSet<>();
        for(int i:nums){
            l.add(i);
        }
        int k=0;
        for(int i:l){
            nums[k]=i;
            k++;
        }
        return k;

        




        

        
    }
}