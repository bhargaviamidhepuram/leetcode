class Solution {
    static boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        //ArrayList<Character> a = new ArrayList<>();
        int n = s.length();
        char[] a = new char[n];
        int p1 = 0, p2 = n - 1;
        while(p1 <= p2){
            if(isvowel(s.charAt(p1)) && isvowel(s.charAt(p2))){
                a[p1] = s.charAt(p2);
                a[p2] = s.charAt(p1);
                p1++;
                p2--;
            }
            else if(isvowel(s.charAt(p1))){
                a[p2] = s.charAt(p2);
                p2--;
            }
            else if(isvowel(s.charAt(p2))){
                a[p1] = s.charAt(p1);
                p1++;
            }
            else if(!isvowel(s.charAt(p1)) && !isvowel(s.charAt(p2))){
                a[p1] = s.charAt(p1);
                a[p2] = s.charAt(p2);
                p1++;
                p2--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i]);
        }
        return sb.toString();
    }
}