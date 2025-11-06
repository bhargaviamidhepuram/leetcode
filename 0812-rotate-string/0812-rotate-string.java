class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        char[] c1 = s.toCharArray();
        char[] c2 = goal.toCharArray();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char last = c1[n - 1];
            for(int j = n - 1; j > 0; j--){
                c1[j] = c1[j - 1];
            }
            c1[0] = last;
            String s1 = new String(c1);
            System.out.println(s1);
            if(s1.equals(goal)){
                return true;
            }
        }
        return false;
    }
}