class Solution
 {
public:
    bool isAnagram(string s, string t) 
    {
        int m=s.size();
        int n=t.size();
    if(m!=n)
    return false;
        unordered_map<char,int>a;
            unordered_map<char,int>b;
       for(int i=0;i<m;i++)
       {
        a[s[i]]++;
       }
        for(int i=0;i<n;i++)
       {
        b[t[i]]++;
       }
      if(a==b)
      return true;
      else
      return false;
        
    }
};