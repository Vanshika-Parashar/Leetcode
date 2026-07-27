class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[]leftCheck=new int[n];
        int[]rightCheck=new int[n];
        Arrays.fill(leftCheck,1);
        Arrays.fill(rightCheck,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                leftCheck[i]=leftCheck[i-1]+leftCheck[i];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightCheck[i]=rightCheck[i]+rightCheck[i+1];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.max(leftCheck[i],rightCheck[i]);
        }
        return sum;
    }
}