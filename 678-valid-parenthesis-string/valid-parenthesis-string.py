class Solution:
    def checkValidString(self, s: str) -> bool:
        low = high = 0

        for ch in s:
            if ch == '(':
                low+=1
                high+=1
            elif ch == ')':
                low -=1
                high-=1
            elif ch == '*':
                low -=1
                high +=1
            
            if high < 0:
                return False
            low = max(0, low)
        return low == 0
        