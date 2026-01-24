class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l2 = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < (1 << n); i++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if(((i >> j) & 1) == 1){
                    l.add(nums[j]);
                }
            }
            if(!l2.contains(l))
            l2.add(l);
        }
        return l2;
    }
}