class Solution:
    def minimumDifference(self, nums: list[int], k: int) -> int:
        n = len(nums)
        nums.sort()#1, 4, 7, 9
        l = 0
        ans = float("inf")
        for r in range(n):
            #li.append(nums[r])
            if r - l == k:
                l += 1
            if r - l + 1 == k:
                ans = min(ans, nums[r] - nums[l])

        return ans




        