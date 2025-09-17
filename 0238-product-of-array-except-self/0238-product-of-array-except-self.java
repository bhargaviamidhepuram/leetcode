class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1, c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
            total *= nums[i];
            else
            c++;
        }
        int[] a = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && c > 0){
                a[i] = 0;
            }
            else if(nums[i] == 0 && c > 1){
                a[i] = 0;
            }  
            else if(nums[i] != 0 && c == 0){
                a[i] = total / nums[i];
            }
            else{
                a[i] = total;
            } 
        }
        return a;
    }
}