class Solution {
    static int countsetbits(int  n){
        int c = 0;
        while(n > 0){
            c += n & 1;
            n = n >> 1;
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        for(int i = 1; i <= n; i++){
            a[i] = countsetbits(i);
        }
        return a;
    }
}