class Solution
 {
public:
bool f(int i,string &s,unordered_set<string> wordSet,vector<int>&dp)
{
    if(i==s.size())
    {
       
        return true;
    }
    if(dp[i]!=-1)
    {
        return dp[i];
    }

    for(int j=i;j<s.size();j++){
        if(wordSet.find(s.substr(i,j-i+1))!=wordSet.end())//mens word mil gaya set mai
        {
         if( f(j+1,s,wordSet,dp))
         {
           return  dp[i]=1;
         }
           
        }
    }
    return dp[i]=0;
}
    bool wordBreak(string s, vector<string>& wordDict)
     {
       
      unordered_set<string> wordSet(wordDict.begin(), wordDict.end());
      vector<int>dp(s.size(),-1);
       return  f(0,s,wordSet,dp);
   
        
    }
};
