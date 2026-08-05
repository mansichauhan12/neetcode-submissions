class Solution 
{
public:
void f(int i,string &s,vector<string>&temp,vector<vector<string>>&ans)
{

    if(i==s.size())
    {
        ans.push_back(temp);
        return;
    }
    for(int j=i;j<s.size();j++)
    {
        if(isPalindrome(i,j,s))
        {
            temp.push_back(s.substr(i,j-i+1));
            f(j+1,s,temp,ans);
            temp.pop_back();
        }
            // f(j,s,temp,ans);

    }
    
}

bool isPalindrome(int i,int j,string s)
{
    
    while(i<=j)
    {
        if(s[i]!=s[j])
        {
            return false;
        }
        i+=1;
        j-=1;
    }
    return true;
}


    vector<vector<string>> partition(string s) 
    {
        vector<vector<string>>ans;
        vector<string>temp;
  
        f(0,s,temp,ans);
        return ans;
    }
};
