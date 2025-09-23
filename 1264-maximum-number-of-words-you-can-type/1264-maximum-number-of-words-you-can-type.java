class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++){
            hs.add(brokenLetters.charAt(i));
        }
        int space = 0, c = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' ' && !hs.contains(text.charAt(i))){
                continue;
            }
            else if(hs.contains(text.charAt(i))){
                space++;
            }
            else if(text.charAt(i) == ' ' && space == 0){
                c++;
            }
            else if(text.charAt(i) == ' ' && space > 0){
                space = 0;
            }
        }
        if(space == 0){
            c++;
        }
        return c;
    }
}