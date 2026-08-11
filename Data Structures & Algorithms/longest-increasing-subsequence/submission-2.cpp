class Solution 
{
public:
int f(int cur,int prev,vector<int>& nums, vector<vector<int>>&dp)
{
    if(cur==nums.size())
    {
        return 0;
    }
    if(dp[cur][prev+1]!=-1)
    {
        return dp[cur][prev+1];
    }

    //take
    int take=0;
    int nottake=0;
    if(prev==-1 || nums[cur]>nums[prev])
    {
        take= 1+f(cur+1,cur,nums,dp);
     
    }
    
  nottake=  0+f(cur+1,prev,nums,dp);


  return dp[cur][prev+1]= max(take,nottake);


}
    int lengthOfLIS(vector<int>& nums) 
    {
        int n=nums.size();
        vector<vector<int>>dp(n,vector<int>(n+1,-1));
        
       return  f(0,-1,nums,dp);
        
    }
};
