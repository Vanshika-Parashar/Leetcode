class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            minp=Math.min(prices[i],minp);
            max=Math.max(max,prices[i]-minp);
        }
        return max;
    }
}
