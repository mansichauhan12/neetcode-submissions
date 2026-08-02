class Solution 
{
    void backtrack(List<List<Integer>>result,List<Integer>temp,int[] nums,int index){

    
        result.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++)
        {
            temp.add(nums[i]);
            backtrack(result,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums)
     {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
       
        backtrack(result,temp,nums,0);
        return result;
    }
}