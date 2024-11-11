class Solution:
    def maxOperations(self, nums: List[int]) -> int:
        n = len(nums)
        @cache
        def dfs(l,r,score):
            if l==r or l>r:
                return 0

            res =0
             
            if nums[l] + nums[l+1]==score:
                res = max(res,1+dfs(l+2,r,score))
            
            if nums[l]+ nums[r] ==score:
                res = max (res,1+dfs(l+1,r-1,score))

            if nums[r]+nums[r-1]==score:
                res = max(res,1+dfs(l,r-2,score))
            
            return res
             
    
        return 1 + max(dfs(1,n-2,nums[0]+nums[n-1]),dfs(2,n-1,nums[0]+nums[1]),dfs(0,n-3,nums[n-1]+nums[n-2]))
        