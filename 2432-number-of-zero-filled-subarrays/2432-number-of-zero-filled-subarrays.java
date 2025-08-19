class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        int c = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            c = (nums[i] == 0) ? c + 1 : 0;
            ans += c;
        }
        //System.out.println(l);
        return ans;
    }
}