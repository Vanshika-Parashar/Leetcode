class Solution {
    public int trap(int[] height) {
       int h=height.length;
       int l=0;
       int r=h-1;
       int ans=0;
       int lmax=0;
       int rmax=0;

       while(l<r){
        lmax=Math.max(lmax,height[l]);
        rmax=Math.max(height[r],rmax);
        if(height[l]<height[r]){
            ans+=lmax-height[l];
            l++;
        }else{
            ans+=rmax-height[r];
            r--;
        }
       }
       return ans;
    }
}