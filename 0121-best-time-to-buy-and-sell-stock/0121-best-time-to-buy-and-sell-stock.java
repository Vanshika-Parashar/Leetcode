class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            max=Math.max(profit,max);
            min=Math.min(prices[i],min);
        }
        return max;

    }
}
