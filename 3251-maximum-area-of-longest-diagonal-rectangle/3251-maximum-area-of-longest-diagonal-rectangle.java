class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        int len = 0;
        for(int i = 0; i < dimensions.length; i++){
            int x = dimensions[i][0];
            int y = dimensions[i][1];
            int sqrt = (x * x) + (y * y);
            if(sqrt > len || (sqrt == len && x * y > area)){
                len = sqrt;
                area = x * y;
            }
        }
        return area;
    }
}