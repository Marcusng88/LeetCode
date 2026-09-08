class Solution:
    def longestValidParentheses(self, s: str) -> int:
        n = len(s)
        res = 0
        dp = [0] * n

        for i in range(1,n):
            if s[i] == ')':
                # if i-1 = '('
                if s[i-1] == '(':
                    dp[i] = 2
                    if i >=2:
                        dp[i] += dp[i-2]
                # if i-1 ')'
                else:
                    match_sym_idx = i - 1 - dp[i-1]
                    if match_sym_idx >= 0 and s[match_sym_idx] == '(':
                        dp[i] = dp[i-1] + 2

                        if match_sym_idx >=1:
                            dp[i]+=dp[match_sym_idx-1]
                res = max(res, dp[i])
        return res