class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        n=len(nums)
        c=0
        ans = []

        for i in range(0,n):
            if(nums[i]!=val):
                ans.append(nums[i])
            else:
                c+=1

        k=n-c
        for i in range(0,k):
            nums[i]=ans[i]

        return k

        