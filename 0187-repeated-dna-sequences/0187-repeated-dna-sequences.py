class Solution:
    def findRepeatedDnaSequences(self, s: str) -> list[str]:
        n = len(s)
        dici = {}
        l = []
        left = 0
        temp = ""
        k = 10
        for r in range(n):
            if r - left + 1 == k:
                temp = s[left : r + 1]
                if temp in dici:
                    dici[temp] += 1
                else:
                    dici[temp] = 1
                left += 1
        for char in dici:
            if dici[char] > 1:
                l.append(char)
        return l
        