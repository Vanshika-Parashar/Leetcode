class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int max=0;
       int right=height.length-1;
       while(left<right){
        int width=right-left;
        int area=width*Math.min(height[left],height[right]);
        max=Math.max(area,max);
        if(height[left]>=height[right]){
            right--;
        }
        else{
            left++;
        }

       }
       return max;
    }

}