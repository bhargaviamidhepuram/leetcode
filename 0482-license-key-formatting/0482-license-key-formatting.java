class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != '-'){
                sb.append(s.charAt(i));
                c++;
            }
            if(c == k){
                sb.append('-');
                c = 0;
            }
        }
        if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '-'){
            sb = new StringBuilder(sb.substring(0,sb.length() - 1));
        }
        return sb.reverse().toString().toUpperCase();
    }
}