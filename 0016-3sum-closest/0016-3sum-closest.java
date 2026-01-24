class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target - sum) < Math.abs(target - closestsum)){
                    closestsum = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        // for(int i = 1; i < (1 << n); i++){
        //     ArrayList<Integer> l = new ArrayList<>();
        //     for(int j = 0; j < n; j++){
        //         if(((i >> j) & 1) == 1){
        //             l.add(nums[j]);
        //         }
        //     }
        //     int sum = 0;
        //     if(l.size() == 3){
        //         for(int k = 0; k < l.size(); k++){
        //             sum += l.get(k);
        //         }
        //         System.out.println(l);
        //         if(ans > Math.abs(target - sum)){
        //             ans = Math.abs(target - sum);
        //             ans1 = sum;
        //             System.out.println(ans);
        //         }
        //     }
        // }
        return closestsum;
    }
}