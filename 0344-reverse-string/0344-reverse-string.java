class Solution {
    public void reverseString(char[] s) {
        int p2 = s.length - 1;
        int p1 = 0;
        while(p1 <= p2){
            char temp = s[p2];
            s[p2] = s[p1];
            s[p1] = temp;
            p1++;
            p2--;
        }
        System.out.print("[");
        for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
            if (i != s.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}