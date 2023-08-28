class Solution {
    public int maxProfit(int[] prices) {
        // 7 , 6 , 4 , 3 , 1
        int buy = Integer.MAX_VALUE , maxprofit = 0 ;
        for(int i = 0 ; i < prices.length; i++){
            if(buy < prices[i]){
                int profit = prices[i] - buy ;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buy = prices[i];
            }
        }return maxprofit;
    }
}