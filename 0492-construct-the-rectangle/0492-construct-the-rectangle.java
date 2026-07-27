class Solution {
    public int[] constructRectangle(int area) {
        int ans = Integer.MAX_VALUE;
        int[] a = new int[2];
        for(int i = 1; i * i <= area; i++){
            if(area % i == 0){
                if(ans > (area / i) - i){
                    ans = (area / i) - i;
                    a[0] = area / i;
                    a[1] = i;
                }
            }
        }
        return a;
    }
}