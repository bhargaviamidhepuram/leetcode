class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        k = k % n;
        for(int j = 0; j < n; j++){
            res[(j + k) % n] = nums[j];
        }
        for(int i = 0; i < n; i++){
            nums[i] = res[i];
        }
    }
}