class Solution {
    public static int multiply(int i, int j){
        return (i - 1) * (j - 1);
    }
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                ans = Math.max(ans, multiply(nums[i], nums[j]));
            }
        }
        return ans;
    }
}