class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int k = 0;
        int[] a = new int[2];
        a[0] = -1;
        a[1] = -1;
        int l = 0, r = n - 1;
        while(l < r){
            int total = numbers[l] + numbers[r];
            if(total == target){
                a[0] = l + 1;
                a[1] = r + 1;
                break;
            }
            else if(total > target){
                r--;
            }
            else if(total < target){
                l++;
            }
        }
        return a;
    }
}