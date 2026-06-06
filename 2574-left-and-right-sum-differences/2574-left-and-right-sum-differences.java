class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        //int p1 = 0, p2 = n - 1;
        for(int i = 0; i < n; i++){
            int j = 0;
            int lsum = 0, rsum = 0;
            while(j < i){
                lsum += nums[j]; 
                j++;
            }
            int k = i + 1;
            while(k < n){
                rsum += nums[k];
                k++;
            }
            a[i] = Math.abs(rsum - lsum);
        }
        return a;
    }
}