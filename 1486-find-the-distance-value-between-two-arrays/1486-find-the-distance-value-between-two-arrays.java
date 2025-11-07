class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for(int n1 : arr1){
            int l = n1 - d;
            int h = n1 + d;
            boolean valid = true;
            for(int n2 : arr2){
                if(n2 >= l && n2 <= h){
                    valid = false;
                    break;
                }
            }
            if(valid){
                c++;
            }
        }
        return c;
    }
}