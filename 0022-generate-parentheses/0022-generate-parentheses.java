class Solution {
    static void backtrack(List<String> res,int l, int r, int n, String s){
        //StringBuilder sb = new StringBuilder<>();
        if(s.length() == n * 2){
            res.add(s);
            return;
        }
        if(l < n){
            backtrack(res, l + 1, r, n, s + "(");
        }
        if(r < l){
            backtrack(res, l, r + 1, n, s + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(res, 0, 0, n, "");
        return res;
    }
}