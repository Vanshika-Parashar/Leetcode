class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>n=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            n.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            n.add(nums2[i]);
        }
        Collections.sort(n);
        int s=n.size();
        double p=0;
        if(s%2==0){
            double left=n.get((s/2)-1);
            double right=n.get(s/2);
            p=(left+right)/2.0;
        }
        else{
            p=n.get(s/2) ;
        }
        return p;
        
    }
}