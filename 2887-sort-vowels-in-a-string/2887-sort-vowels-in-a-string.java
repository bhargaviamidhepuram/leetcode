class Solution {
    static boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String sortVowels(String s) {
        int n = s.length();
        ArrayList<Character> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(isvowel(s.charAt(i))){
                //int x = (int)s.charAt(i);
                a.add(s.charAt(i));
            }
        }
        Collections.sort(a);
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n; i++){
            if(isvowel(s.charAt(i))){
                sb.append(a.get(j));
                j++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }return sb.toString();
    }
}