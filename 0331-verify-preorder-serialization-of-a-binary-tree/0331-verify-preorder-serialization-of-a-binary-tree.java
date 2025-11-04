class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] str = preorder.split(",");
        int slots = 1;
        for(String s : str){
            if(slots <= 0){
                return false;
            }
            if(s.equals("#")){
                slots--;
            }
            else
            slots++;
        }
        return slots == 0;
    }
}