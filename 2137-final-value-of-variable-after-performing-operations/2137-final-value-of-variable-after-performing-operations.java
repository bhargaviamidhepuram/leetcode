class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if("X++".equals(operations[i])){
                x = x + 1;
            }
            else if("++X".equals(operations[i])){
                x = x + 1;
            }
            else if("X--".equals(operations[i])){
                x = x - 1;
            }
            else{
                x = x - 1;
            }
            System.out.println(x);
        }
        return x;
    }
}