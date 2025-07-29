class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        phone_map = {
            '2' : 'abc', '3':'def','4':'ghi','5':'jkl','6':'mno','7':'pqrs',
            '8':'tuv','9':'wxyz'
        }
        result = []
        def backtrack(idx : int, curr : str):
            if(idx == len(digits)):
                result.append(curr)
                return
            for c in phone_map[digits[idx]]:
                backtrack(idx + 1, curr + c)
        backtrack(0,"")
        return result