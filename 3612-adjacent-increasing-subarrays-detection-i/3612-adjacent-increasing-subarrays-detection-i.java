class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int c = 1, ans = 0, precnt = 0;
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) > nums.get(i - 1)){
                c++;
            }
            else{
                precnt = c;
                c = 1;
            }
            ans = Math.max(ans,Math.min(precnt, c));
            ans = Math.max(ans, c / 2);
        }
        return ans >= k;
    }
}