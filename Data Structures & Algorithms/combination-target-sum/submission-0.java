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
        for(int i=ind;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
                list.add(nums[i]);
                f(i,nums,target-nums[i],ans,list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target)
     {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        f(0,nums,target,ans,list);
        return ans;
    }
}
