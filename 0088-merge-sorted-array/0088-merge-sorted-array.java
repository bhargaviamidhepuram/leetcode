class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        for(int k = 0; k < n; k++){
            nums1[m] = nums2[i];
            i++;
            m++;
        }
        Arrays.sort(nums1);
    }
}