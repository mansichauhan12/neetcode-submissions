class Solution
 {
    int f(int i,int amount, int[] coins,   int [][]dp)
    {
        if(i==coins.length-1)
        {
            return amount%coins[i]==0?1:0;
        }
        int take=0;
        int nottake=0;
        if(dp[i][amount]!=-1)
        return dp[i][amount];
        if(coins[i]<=amount)
        {
            take=f(i,amount-coins[i],coins,dp);
        }
        nottake=f(i+1,amount,coins,dp);
        return dp[i][amount]=take+nottake;
    }
    public int change(int amount, int[] coins)
     {
        int n=coins.length;
        int [][]dp=new int[n][amount+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return f(0,amount,coins,dp);
    }
}