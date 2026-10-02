class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            s2.add(i);
        }
        List<List<Integer>>ans=new ArrayList<>();
        LinkedHashSet<Integer>l1=new LinkedHashSet<>();
        LinkedHashSet<Integer>l2=new LinkedHashSet<>();
        for(int i:nums1){
            if(!s2.contains(i)){
                l1.add(i);
            }
        }
        for(int i:nums2){
            if(!s1.contains(i)){
                l2.add(i);
            }
        }
        List<Integer>a1=new ArrayList<>();
        for(int i:l1){
            a1.add(i);
        }
        List<Integer>a2=new ArrayList<>();
        for(int i:l2){
            a2.add(i);
        }
        ans.add(a1);
        ans.add(a2);
        
        return ans;



        
    }
}