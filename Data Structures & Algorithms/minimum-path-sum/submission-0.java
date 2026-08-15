
class Solution
 {

int f(int i,int j,int [][] grid,  int [][]dp)
{
    if(i==grid.length-1 && j==grid[0].length-1)
    {
        return grid[i][j];
    }
    int down=Integer.MAX_VALUE;
    int right=Integer.MAX_VALUE;
    if(dp[i][j]!=-1)
    {
        return dp[i][j];
    }

    if(i<grid.length-1)
    {
        down=grid[i][j]+f(i+1,j,grid,dp);
    }
    if(j<grid[0].length-1)
    {
        right=grid[i][j]+f(i,j+1,grid,dp);
    }
    return dp[i][j]= Math.min(down,right);
}

   
       public int minPathSum(int[][] grid) 
   
     {
        int m=grid.length;
        int n=grid[0].length;
        // vector<vector<int>>dp(m,vector<int>(n,-1));
        int [][]dp=new int[m][n];
        for(int [] row:dp)
        {
            Arrays.fill(row,-1);
        }

       return  f(0,0,grid,dp);
    }
};