class Solution {
    static int function(int[] nums, int index, int curor, int maxor){
        if(index == nums.length){
            return curor == maxor ? 1 : 0;
        }
        int include = function(nums, index + 1, curor | nums[index], maxor);
        int exclude = function(nums, index + 1, curor, maxor);
        return include + exclude;
    }
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxor = 0;
        for(int  i = 0; i < n; i++){
            maxor |= nums[i];
        }
        return function(nums, 0, 0, maxor);  
    }
}