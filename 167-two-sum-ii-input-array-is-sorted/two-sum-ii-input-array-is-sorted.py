class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        n = len(numbers)-1
        left = 0
        right = n
        res = [0] * 2
        while left<right:
            if numbers[left] +numbers[right] == target:
                res[0] = left+1
                res[1] = right+1
                return res
            if numbers[left] + numbers[right] < target:
                left +=1
            else:
                right-=1
        return res

        