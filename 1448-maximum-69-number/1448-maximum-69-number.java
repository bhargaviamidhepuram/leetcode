class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '9' && c == 0){
                sb.append('9');
                c++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString();
        return Integer.parseInt(str);
    }
}