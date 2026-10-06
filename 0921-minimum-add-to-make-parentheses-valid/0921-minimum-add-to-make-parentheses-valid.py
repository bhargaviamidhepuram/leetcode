class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        n = len(s)
        ob = 0
        minreq = 0
        for i in range(n):
            if s[i] == '(':
                ob += 1
            elif s[i] == ')' and ob == 0:
                minreq += 1
            elif s[i] == ')':
                ob -= 1

        return ob + minreq