class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        # # first intuition brute force
        # n = len(nums1)
        # nums2 = []
        # odd = True
        # even = True
        # # odd
        # for i in range(n):
        #     curr = nums1[i]
        #     if curr %2 != 0:
        #         nums2.append(curr)
        #         continue
            
        #     for j in range(n):
        #         if j == i :
        #             continue
        #         second = curr - nums1[j]
        #         if second % 2 != 0:
        #             nums2.append(curr)
        #             break
        #         if j == n:
        #             even = False
        
        # nums2.clear()
        # # even
        # for i in range(n):
        #     curr = nums1[i]
        #     if curr %2 == 0:
        #         nums2.append(curr)
        #         continue
            
        #     for j in range(n):
        #         if j == i :
        #             continue
        #         second = curr - nums1[j]
        #         if second % 2 == 0:
        #             nums2.append(curr)
        #             break
        #         if j == n:
        #             even = False



            

        # return odd or even
        return True