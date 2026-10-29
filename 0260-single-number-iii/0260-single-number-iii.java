class Solution {
    public int[] singleNumber(int[] nums) {
        int[] a = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for(int num : hm.keySet()){
            if(hm.get(num) == 1){
                a[i++] = num;
            }
        }
        return a;
        
    }
}