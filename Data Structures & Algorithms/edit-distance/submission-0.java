class Solution {

int f(int i,int j,String word1,String word2,int[][] dp)
{
    if(i<0)
    {
        return j+1;
    }
    if(j<0)
    {
        return i+1;
    }
    if(dp[i][j]!=-1)
    {
        return dp[i][j];
    }
       int op1=0;
    int op2=0;
    int op3=0;
    // int mini=INT_MAX;
    int mini = Integer.MAX_VALUE;

    if (word1.charAt(i) == word2.charAt(j))
    {
        return dp[i][j]=0+f(i-1,j-1,word1,word2,dp);
    }
 
    else
    {
            //3 cases 
            //insert
            op1=1+f(i,j-1,word1,word2,dp);
            //delete
            op2=1+f(i-1,j,word1,word2,dp);
            //replace
            op3=1+f(i-1,j-1,word1,word2,dp);
            mini=Math.min(op1,op2);
            return dp[i][j]= Math.min(mini,op3);
    }
}
     public int minDistance(String word1, String word2)
    {
        int n1=word1.length();
        int n2=word2.length();
        // List<List<Integer>>dp(n1+1,List<Integer>(n2+1,-1));
  int[][] dp = new int[n1 + 1][n2 + 1];

for (int[] row : dp) {
    Arrays.fill(row, -1);
}

        return f(n1-1,n2-1,word1,word2,dp);
        

    }
};
