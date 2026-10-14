class Solution:
    def largestNumber(self, nums: list[int]) -> str:
        num_string = [str(num) for num in nums]
        num_string.sort(key = lambda a: a * 10, reverse = True)
        if num_string[0] == '0':
            return "0"
        return "".join(num_string)
        