class Solution 
{
public:
 void backtrack(  vector<vector<int>>&result, vector<int>&temp,vector<int>& nums,int index)
{
     result.push_back(temp);
    for(int i=index;i<nums.size();i++)
    {
        //inlcude it 
        temp.push_back(nums[i]);
        backtrack(result,temp,nums,i+1);
       
    //not include 
        // temp.remove(temp.size()-1);
    temp.pop_back();
    }

}
    vector<vector<int>> subsets(vector<int>& nums)
     {
        // vector<int>result;
        vector<vector<int>> result;
        vector<int>temp;
        backtrack(result,temp,nums,0);
        return result;
    }
};