
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini = numeric_limits<int>::max();
        int profit = 0;
        for (int i = 0; i < prices.size(); i++){
            
            if ( prices[i] < mini){
                mini = prices[i];
            }
            
            if ( prices[i] - mini > profit){
                profit = prices[i] - mini;
            }
        }
        return profit;
    }
};