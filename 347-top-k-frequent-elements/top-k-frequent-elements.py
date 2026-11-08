class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        freq = {}
        for num in nums:
            freq[num] = freq.get(num,0) +1
        
        bucket = [[] for _ in range(len(nums)+1)]
        for value , frequency in freq.items():
            bucket[frequency].append(value)
        
        res = []
        for frequency in range(len(nums) , 0 ,-1):
            for value in bucket[frequency]:
                res.append(value)
                if len(res) == k:
                    return res
        return res