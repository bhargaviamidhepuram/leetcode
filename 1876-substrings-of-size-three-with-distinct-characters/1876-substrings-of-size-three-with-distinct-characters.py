class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        n = len(s)
        k = 3
        l = 0
        ans = 0
        temp = []
        for r in range(n):
            temp += s[r]
            if r - l == k:
                temp.pop(0)
                l += 1 
            if r - l + 1 == 3 and len(set(temp)) == k:
                ans += 1
                
        return ans      





        