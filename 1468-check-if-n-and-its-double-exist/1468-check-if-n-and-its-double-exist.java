class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        } 
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && hs.contains(arr[i] * 2)){
                return true;
            }
            else if(arr[i] == 0){
                c++;
                if(c == 2){
                    return true;
                }
            }
        }
        return false;
    }
}