class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int ec = 0, oc = 0, ac = 0, parity = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                ec++;
                if(parity == 1 || parity == -1){
                    ac++;
                }
            }
            else{
                oc++;
                if(parity == 0 || parity == -1){
                    ac++;
                }
            }
            parity = nums[i] % 2;
        }
        return Math.max(ac, Math.max(ec, oc));
    }
}