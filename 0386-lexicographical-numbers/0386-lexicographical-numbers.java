class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> a = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            generate(i, n, a);
        }
        return a;
    }
    private void generate(
        int curnum,
        int limit,
        List<Integer> result
    ){
        if(curnum > limit)return;
        result.add(curnum);
        for(int j = 0; j <= 9; ++j){
            int next = curnum * 10 + j;
            if(next <= limit){
                generate(next, limit, result);
            }
            else{
                break;
            }
        }
    }
}