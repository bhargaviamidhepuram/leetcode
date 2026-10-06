class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        n = len(s)
        freq = {}
        max_freq = 0
        maxlen = 0
        l = 0
        for r in range(n):
            if s[r] in freq:
                freq[s[r]] += 1
            else:
                freq[s[r]] = 1
            max_freq = max(max_freq, freq[s[r]])
            if (r - l + 1) - max_freq > k:
                freq[s[l]] -= 1
                l += 1
            maxlen = max(maxlen, r - l + 1)
        return maxlen
