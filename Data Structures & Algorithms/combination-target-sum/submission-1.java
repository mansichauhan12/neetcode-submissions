class Solution
 {
    void f(int ind,int[] nums,int target,List<List<Integer>>ans,  List<Integer>list)
    {
        if(target==0)
        {
            // ans.add(list);
               ans.add(new ArrayList<>(list));
            return;
        }
        if(ind>=nums.length || target<0)
        return;
        if(nums[ind]<=target)
            {
                list.add(nums[ind]);
                f(ind,nums,target-nums[ind],ans,list);
                list.remove(list.size()-1);
            }
                f(ind+1,nums,target,ans,list);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target)
     {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        f(0,nums,target,ans,list);
        return ans;
    }
}
