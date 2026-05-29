class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>n=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            n.add(nums2[i]);

        }
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            int index=n.indexOf(nums1[i]);
            for(int j=index+1;j<n.size();j++){
                if(nums1[i]<n.get(j)){
                    ans[i]=n.get(j);
                    break;
                }
                
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==nums1[i]){
                ans[i]=-1;
            }
            
        }
        return ans;
    }
}