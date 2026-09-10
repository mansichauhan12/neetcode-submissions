class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        n=len(nums)
        mp = {}

        for i in range(0,n):
            mp[nums[i]]=mp.get(nums[i],0)+1;


        for key,value in mp.items():
            if value>n/2:
                return key
        
        return -1;
        