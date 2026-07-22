class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        n = len(word)
        c, c2 = 0, 0
        if word.istitle():
            return True
        for i in word:
            if i.isupper():
                c += 1
            elif i.islower():
                c2 += 1
        if c == n or c2 == n:
            return True 
        else:
            return False
        