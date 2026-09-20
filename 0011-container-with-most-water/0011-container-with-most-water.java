class Solution {
    public int maxArea(int[] height) {
        int h=height.length;
       int l=0;
       int r=h-1;
       int max=0;
       while(l<r){
        int area=r-l;
        int vol=area*Math.min(height[l],height[r]);
        max=Math.max(vol,max);
        if(height[l]>height[r]){
            r--;
        }else{
            l++;
        }
       }
       return max;

    }

}