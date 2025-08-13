class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i = 1; i * i * i <= n; i++){
            if(i * i * i == n){
                return true;
            }
        }
        return false;
    }
}