class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum>=target){
                sum-=arr[i];
                min=Math.min(j-i+1,min);
                i++;
            }
           
        }
        if(min==Integer.MAX_VALUE)return 0;
         return min;
    }
}