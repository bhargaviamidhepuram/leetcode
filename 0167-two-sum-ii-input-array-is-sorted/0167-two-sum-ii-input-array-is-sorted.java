class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0, j = n - 1;
        int[] a = new int[2];
        int sum = 0;
        while(i < j){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                a[0] = i + 1;
                a[1] = j + 1;
                break;
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return a;
    }
}