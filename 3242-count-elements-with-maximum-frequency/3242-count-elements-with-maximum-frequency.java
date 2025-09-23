class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i] , 0) + 1);
        }
        int maxFreq = 0;
        for (int freq : hm.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        int total = 0;
        for (int freq : hm.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}