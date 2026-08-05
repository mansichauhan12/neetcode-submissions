class Solution 
{
    void f(int i,String s,List<String>temp, List<List<String>>ans)
    {
        if(i>=s.length())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(isPalindrome(i,j,s))
            {
                temp.add(s.substring(i,j+1));
                f(j+1,s,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
   boolean isPalindrome(int start,int end,String s) 
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            return false;

            start+=1;
            end-=1;
        }
        return true;
    }
    public List<List<String>> partition(String s)
     {
        List<List<String>>ans=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        f(0,s,temp,ans);
        return ans;
    }
}
