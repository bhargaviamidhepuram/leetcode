class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }
        int res = nums[0];
        int cursum = nums[0];
        for(int i = 1; i < nums.length; i++){
            cursum = Math.max(nums[i], cursum + nums[i]);
            res = Math.max(res, cursum);
        }
        return res;
    }
}