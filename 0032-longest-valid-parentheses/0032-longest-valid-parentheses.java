class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() <= 1){
            return 0;
        }
        int maxlen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int  i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxlen = Math.max(maxlen, i - st.peek());
                }
            }
        }
        return maxlen;
    }
}