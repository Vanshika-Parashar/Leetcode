class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            max=Math.max(profit,max);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
