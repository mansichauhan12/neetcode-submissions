class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        n=len(nums)
       
        st=set()
        for i in range(0,n):
            st.add(nums[i])
        j=0;
        for it in sorted(st):
            nums[j]=it
            j+=1; 
              
        return len(st)