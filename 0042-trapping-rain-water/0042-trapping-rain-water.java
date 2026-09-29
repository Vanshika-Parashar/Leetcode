class Solution {
    public int trap(int[] height) {
        int h=height.length;
        int l=0;
        int r=h-1;
        int lmax=0;
        int rmax=0;
        int an=0;
        while(l<r){
            lmax=Math.max(height[l],lmax);
            rmax=Math.max(height[r],rmax);
            if(lmax<rmax){
                an+=lmax-height[l];
                l++;
            }else{
                an+=rmax-height[r];
                r--;
            }
        }
        return an;
        
    }
}