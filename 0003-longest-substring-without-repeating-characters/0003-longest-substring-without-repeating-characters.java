class Solution {
    // static boolean check(String s){
    //     int n = s.length();
    //     HashSet<Character> h = new HashSet<>();
    //     for(int i = 0; i < s.length(); i++){
    //         if(!h.contains(s.charAt(i))){
    //             h.add(s.charAt(i));
    //         }
    //     }
    //     return (h.size() == n) ? true : false;
    // }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s.length() < 1){
            return 0;
        }
        int ans = 0;
        int l = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(i));
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}