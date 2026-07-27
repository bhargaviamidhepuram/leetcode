class Solution {
    public int hammingDistance(int x, int y) {
        if(x == y){
            return 0;
        }
            int c = 0;
        while(x > 0 || y > 0){
            int xb = 0;
            int yb = 0;
            if(x > 0){
                xb = x % 2;
                x = x / 2;
            }
            if(y > 0){
                yb = y % 2;
                y = y / 2;
            }
            if(xb != yb){
                c++;
            }
        }
        return c;
    }
}