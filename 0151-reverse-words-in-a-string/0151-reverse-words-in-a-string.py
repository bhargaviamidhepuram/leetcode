class Solution:
    def reverseWords(self, s: str) -> str:
        st = s.split()
        temp = ""
        while st:
            temp += st.pop() + " "
        return temp.strip()

                