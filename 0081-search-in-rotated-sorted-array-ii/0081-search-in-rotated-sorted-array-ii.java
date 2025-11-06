class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        if(hs.contains(target)){
            return true;
        }
        else{
            return false;
        }
    }
}