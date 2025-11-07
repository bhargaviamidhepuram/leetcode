class Solution {
    public static int binarysearch(List<Integer> a, int target){
        int l = 0, h = a.size() - 1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(a.get(m) == target){
                return m;
            }
            else if(a.get(m) < target){
                l = m + 1;
            }
            else{
                h = m - 1;
            }
        }
        return l;
    }
    public int lengthOfLIS(int[] nums) {
        int c = 1;
        int len = nums.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int n : nums){
            if(a.isEmpty() || a.get(a.size() - 1) < n){
                a.add(n);
            }
            else{
                int idx = binarysearch(a, n);
                a.set(idx, n);
            }
        }
        return a.size();
    }
}