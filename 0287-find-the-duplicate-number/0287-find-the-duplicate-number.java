class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(hs.contains(nums[i])){
                ans =  nums[i];
                break;
            }
            else{
                hs.add(nums[i]);
            }
        }
        return ans;
    }
}