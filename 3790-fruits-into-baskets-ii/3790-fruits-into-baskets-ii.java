class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int c = 0;
        for(int i = 0; i < n; i++){
            int set = 1;
            for(int j = 0; j < n; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    set = 0;
                    break;
                }
            }
            c += set;
        }
        return c;
    }
}