class Solution
 {
    void backtrack( Set<List<Integer>>st,List<Integer>temp,int[] nums,int ind)
    {
       
         st.add(new ArrayList<>(temp));
         for(int i=ind;i<nums.length;i++)
         {
            temp.add(nums[i]);
            backtrack(st,temp,nums,i+1);
            temp.remove(temp.size()-1);

         }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer>temp=new ArrayList<>();;
        Set<List<Integer>>st=new HashSet<>();
        // List<List<Integer>> ans = new ArrayList<>();
     
        backtrack(st,temp,nums,0);


// for(List<Integer>subset:st)
// {
//     ans.add(subset);
// }
// return ans;
   return new ArrayList<>(st);
    }
}
