class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i=0;
        int min=Integer.MAX_VALUE;;
 
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum>=target){
                min=Math.min(j-i+1,min);
                sum-=arr[i];
                i++;
            }
        }
        if(min==Integer.MAX_VALUE)return 0;
        return min;
    }
}






