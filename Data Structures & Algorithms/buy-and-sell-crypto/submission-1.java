public class Solution {
    public int maxProfit(int[] prices) {
        int buy;
        int sell;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                sell=prices[j];
                profit=Math.max(profit,sell-buy);

            }

        }
        return profit; 
           }
}