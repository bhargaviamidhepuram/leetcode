class Solution {
    static int binomialcoeff(int n, int i){
        int res = 1;
        if( i > n - i){
            i = n - i;
        }
        for(int j = 0; j < i; j++){
            res *= (n - j);
            res /= (j + 1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l =  new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                a.add(binomialcoeff(i, j));
            }
            l.add(a);
        }
        return l;
    }
}