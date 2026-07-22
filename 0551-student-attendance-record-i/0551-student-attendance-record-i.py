class Solution:
    def checkRecord(self, s: str) -> bool:
        s1 = "AA"
        s2 = "LLL"
        if s.count('A') >= 2:
            return False
        elif s2 in s:
            return False
        return True