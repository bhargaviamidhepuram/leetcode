class Solution {
    public int maxSum(int[] nums) {
        int n =  nums.length;
        HashSet<Integer> hs  = new HashSet<>();
        for(int  i = 0; i < n; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
        }
        int ans = -101, sum = -101;
        ArrayList<Integer> l =  new ArrayList(hs);
        Collections.sort(l);
        System.out.println(l);
        for(int i = 0; i < l.size(); i++){
            for(int j = i; j < l.size(); j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    sum += l.get(k);
                }
                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }
}