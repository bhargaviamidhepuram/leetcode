class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] d = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            d[i] = nums[i];
        }
        Arrays.sort(nums);
        int[] count = new int[101];
        int[] ans = new int[nums.length];
        count[0] = 0;
        // 1, 2, 2, 3, 8
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1])
                count[nums[i]] = i; 
            else{
                count[nums[i]] = count[nums[i - 1]];
            }
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = count[d[i]];
            System.out.println(ans[i]);
        }
        return ans;
    }
}