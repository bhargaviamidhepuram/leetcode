class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int maxi = arr[n - 1];
        int ans = 0;
        System.out.println(maxi);
        int[] count = new int[maxi + 1];
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        int c = 0;
        count[0] = 1;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                c++;
                if(c == k){
                    ans = i;
                    break;
                }
            }
        }
        if(ans == 0){
            ans = maxi + k - c;
        }
        return ans;
    }
}