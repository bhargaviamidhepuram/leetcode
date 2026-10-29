class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int num : hm.keySet()){
            if(hm.get(num) > (n / 3)){
                a.add(num);
            }
        }
        return a;
    }
}