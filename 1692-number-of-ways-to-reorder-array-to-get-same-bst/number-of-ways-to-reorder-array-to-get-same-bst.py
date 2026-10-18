class Solution:
    def numOfWays(self, nums: list[int]) -> int:
        mod = 10 ** 9 + 7
        n = len(nums)

        comb = [[0] * (n+1) for _ in range(n+1)]
        for a in range(n+1):
            comb[a][0] = comb[a][a] = 1

            for b in range(1,a):
                comb[a][b] = (
                    comb[a-1][b-1] + comb[a-1][b]
                ) % mod
        
        def ways(values):
            if len(values) <=1 :
                return 1
            root = values[0]
            left = []
            right = []
            for i in range(1,len(values)):
                value = values[i]
                if value < root:
                    left.append(value)
                else:
                    right.append(value)
            
            left_ways = ways(left)
            right_ways = ways(right)

            left_comb = comb[len(values)-1][len(left)]

            return (left_comb * left_ways * right_ways) % mod
        return (ways(nums)-1) % mod
