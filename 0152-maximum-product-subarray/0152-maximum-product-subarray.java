class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        //ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = i; j < n; j++){
                product *= nums[j];
                if(product > maxi){
                    maxi = product;
                }
            }
        }
        return maxi;
    }
}