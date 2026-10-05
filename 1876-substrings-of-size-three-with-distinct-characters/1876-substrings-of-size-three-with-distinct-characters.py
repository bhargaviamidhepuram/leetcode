class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        n = len(s)
        k = 3
        l = 0
        dici = {}
        ans = 0
        for r in range(n):
            if s[r] in dici:
                dici[s[r]] += 1
            else:
                dici[s[r]] = 1
            if r - l == k:
                dici[s[l]] -= 1
                if dici[s[l]] == 0:
                    dici.pop(s[l])
                l += 1
            if len(dici) == k:
                ans += 1
                
        return ans      





        