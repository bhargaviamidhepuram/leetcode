class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxval = 0, ans = 0, cur = 0;
        for(int i = 0; i < n; i++){
            if(maxval < nums[i]){
                maxval = nums[i];
                ans = cur = 0;
            }
            if(nums[i] == maxval){
                cur++;
            }
            else{
                cur = 0;
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}