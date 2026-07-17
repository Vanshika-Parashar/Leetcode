class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int max=Integer.MIN_VALUE;
       while(left<right){
        int area=right-left;
        int heights=Math.min(height[left],height[right]);
        int water=area*heights;
        max=Math.max(max,water);
        if(height[left]>height[right]){
            right--;
        }
        else{
            left++;
        }
       }
       return max;
    }

}