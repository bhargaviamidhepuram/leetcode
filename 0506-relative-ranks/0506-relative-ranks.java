class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        int[] a = Arrays.copyOf(score, score.length);
        Arrays.sort(a);
        for(int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(i == 0){
                hm.put(a[i], "Gold Medal");
            }
            else if(i == 1){
                hm.put(a[i], "Silver Medal");
            }
            else if(i == 2){
                hm.put(a[i], "Bronze Medal");
            }
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(i + 1);
                String s = sb.toString();
                hm.put(a[i], s);
            }
        }
        for(int i = 0; i < score.length; i++){
            str[i] = hm.get(score[i]);
        }
        return str;
    }
}