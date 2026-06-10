class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>n=new HashSet<>();
        for(int i:nums){
            if(n.contains(i))return true;
            n.add(i);
        }
        return false;
        
    }
}