class Solution {
    public String smallestPalindrome(String s) {
        int len = s.length();
        char[] ch = s.toCharArray();
        int mid = len / 2;
        Arrays.sort(ch, 0, mid);
        for(int i = 0; i < mid; i++){
            ch[len - i - 1] = ch[i];
        }
        return new String(ch);
    }
}