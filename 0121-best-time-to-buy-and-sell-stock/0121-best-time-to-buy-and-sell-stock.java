class Solution {
    public int maxProfit(int[] prices) {
        int least=Integer.MAX_VALUE;
        int current_p=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<least){
                least=prices[i];
            }
        current_p=prices[i]-least;
        if(profit<current_p){
            profit=current_p;
        }
        }
        return profit;
    }
}