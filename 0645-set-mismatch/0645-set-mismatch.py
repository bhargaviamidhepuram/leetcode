class Solution:
    def findErrorNums(self, nums: list[int]) -> list[int]:
        arr = [1] * (len(nums) + 1)
        arr[0] = 0
        result = []
        for i in nums:
            arr[i] -= 1
            if arr[i] == -1:
                result.append(i)
        for i in range(len(arr)):
            if arr[i] == 1:
                result.append(i)
        return result