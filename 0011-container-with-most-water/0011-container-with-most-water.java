class Solution {
    public int maxArea(int[] height) {
        int h=height.length;
       int l=0;
       int r=h-1;
       int ans=Integer.MIN_VALUE;
       while(l<r){
        int area=r-l;
        int vol=area*Math.min(height[l],height[r]);
        ans=Math.max(vol,ans);
        if(height[l]<height[r]){
            l++;
        }else{
           r--;
        }
       }
       return ans;

    }

}