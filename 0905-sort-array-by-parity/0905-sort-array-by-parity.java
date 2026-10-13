class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int p1 = 0, p2 = n - 1;
        while(p1 <= p2){
            if(nums[p1] % 2 != 0 && nums[p2] % 2 == 0){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            }
            else if(nums[p1] % 2 == 0 && nums[p2] % 2 == 0){
                p1++;
            }
            else{
                p2--;
            }
        }
        return nums;
    }
}