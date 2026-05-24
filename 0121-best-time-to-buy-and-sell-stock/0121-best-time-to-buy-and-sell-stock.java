class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int n =prices.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
    }
}
