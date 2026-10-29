class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int h = n - i;
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;
    }
}