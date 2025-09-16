class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        int[] a = new int[n];
        for(int i = 2; i < n; i++){
            a[i] = 1;
        }
        int c = 0, count = 0;
        for(int i = 2; i * i < n ; i++){
            if(a[i] == 1){
                for(int j = i * i; j < n; j += i){
                    a[j] = 0;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(a[i] == 1){
                count++;
            }
        }
        return count;
    }
}