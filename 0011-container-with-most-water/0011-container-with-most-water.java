class Solution {
    public int maxArea(int[] height) {
        int h=height.length;
       int l=0;
       int r=h-1;
       int max=Integer.MIN_VALUE;
       while(l<r){
        int area=r-l;
        int vol=area*Math.min(height[l],height[r]);
        max=Math.max(max,vol);
        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
       }
       return max;
    }

}