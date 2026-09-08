class Solution:
    def countCommas(self, n: int) -> int:
        if n < 1000:
            return 0
        s = str(n)
        n_comma = len(s) // 3
        if len(s) % 3 == 0:
            n_comma -=1
        check = n_comma * 3
        print(check)
        res = 0
        for i in range(1,n+1):
            if len(str(i)) > check:
                res +=1
        
        return res
        

        