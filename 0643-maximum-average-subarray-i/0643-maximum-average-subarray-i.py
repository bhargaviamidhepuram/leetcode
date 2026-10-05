class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        n = len(nums)
        maxi = sum(nums[:k])
        total = maxi
        for r in range(k , n):
            maxi += nums[r]
            maxi -= nums[r - k]
            total = max(maxi, total)
        return total / k

        