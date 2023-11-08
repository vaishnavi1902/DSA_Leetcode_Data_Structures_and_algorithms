class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ans = 0 , max = 0;
        if(prices.size() < 2){
            return 0 ;
        }
        else{
            for(int i = 0  ; i < prices.size() - 1 ; i++){
                if(prices[i] < prices[i+1]){
                    max = prices[i + 1] - prices[i];
                    ans = ans + max;
                }
            }
        }
        return ans;
    }
};