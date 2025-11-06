class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = 0;
        int h = n - 1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(citations[m] >= n - m){
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return n - l;
    }
}