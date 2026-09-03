class Solution
 {
public:
    bool isAnagram(string s, string t) 
    {
        int m=s.size();
        int n=t.size();


        int freq[26]={0};
        if(m!=n)
        return false;
        for(int i=0;i<m;i++)
        {
            freq[s[i]-'a']+=1;
            freq[t[i]-'a']-=1;

        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            return false;
        }
        return true;
        
    }
};