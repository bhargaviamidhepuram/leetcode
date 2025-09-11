class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = n - 1; i >= 0; i--){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                c++;
                if(c == 3){
                    return nums[i];
                }
            }
        }
        return nums[n - 1];
    }
}