class Solution
 {
public:
int f(int i,vector<int>& coins, int amount, vector<vector<int>>&dp)
{
    if(amount==0)
    return 0;
    if(i==coins.size() || amount<0)
    {
        return INT_MAX;
    }
    if(dp[i][amount]!=-1)
    {
        return dp[i][amount];
    }
    int take=INT_MAX;
    int nottake=INT_MAX;
    if(coins[i]<=amount)
    {
        int res=f(i,coins,amount-coins[i],dp);
        if(res!=INT_MAX)
        {
            take=1+res;
        }
    }
    nottake=f(i+1,coins,amount,dp);
    return  dp[i][amount]=min(take,nottake);
}
    int coinChange(vector<int>& coins, int amount) 
    {
        int n=coins.size();

        vector<vector<int>>dp(n,vector<int>(amount+1,-1));
                int ans=f(0,coins,amount,dp);
        return ans==INT_MAX?-1:ans;
        
    }
};