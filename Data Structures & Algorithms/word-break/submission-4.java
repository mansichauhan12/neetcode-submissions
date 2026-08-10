
class Solution
 {

boolean f(int i,String s, Set<String> wordSet,int[] dp)
{
    if(i==s.length())
    {
       
        return true;
    }
    if(dp[i]!=-1)
    {
             return dp[i] == 1;
    }

    for(int j=i;j<s.length();j++){
        if(wordSet.contains(s.substring(i,j+1)))//mens word mil gaya set mai
        {
         if( f(j+1,s,wordSet,dp))
         {
            dp[i]=1;
          
return true;
         }
           
        }
    }
    dp[i]=0;
    return false;
}
 public boolean wordBreak(String s, List<String> wordDict) 
     {
       
      Set<String> wordSet=new HashSet<>(wordDict);


int[] dp=new int[s.length()];
Arrays.fill(dp,-1);
       return  f(0,s,wordSet,dp);
   
        
    }
};