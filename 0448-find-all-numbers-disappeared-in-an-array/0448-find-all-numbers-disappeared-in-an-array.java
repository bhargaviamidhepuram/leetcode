class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a =  new ArrayList<>();
        int[] count = new int[nums.length + 1];
        count[0] = 1;
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                a.add(i);
            }
        }
        return a;
    }
}