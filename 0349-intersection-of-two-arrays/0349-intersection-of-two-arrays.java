class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        Set<Integer>se=new HashSet<>();
        for(int i:nums2){
            if(s1.contains(i)){
                se.add(i);
            }
        }
        int []ans=new int[se.size()];
        int idx=0;
        for(int i:se){
            ans[idx++]=i;
        }
        return ans;
        
    }
}