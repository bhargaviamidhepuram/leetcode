class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        if(n < 0){
            n = -n;
           x = 1 / x;
        }
        while(n != 0){
            if((n & 1) == 1){
                res *= x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }
}