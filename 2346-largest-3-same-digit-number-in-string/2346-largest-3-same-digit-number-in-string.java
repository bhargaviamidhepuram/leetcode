class Solution {
    static boolean check(String s){
        int i = 0;
        if(s.charAt(i) == s.charAt(i + 1) && (s.charAt(i) == s.charAt(i + 2))){
            return true;
        }
        return false;

    }
    public String largestGoodInteger(String num) {
        HashSet<String> hs = new HashSet<>();
        int n = num.length();
        int max = -1;
        for(int i = 0; i <= n - 3; i++){
            String s = num.substring(i, i + 3);
            if(check(s)){
                int x = Integer.parseInt(s);
                max = Math.max(max, x);
            }
        }
        String str = "";
        //System.out.println(max);
        if(max > 0){
            str = Integer.toString(max);
        }
        else if(max == 0){
            str = "000";
        }
        return str;
    }
}