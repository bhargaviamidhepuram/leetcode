class Solution {
    public int distributeCandies(int[] candyType) {
        int c = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int  i = 0; i < candyType.length; i++){
            hs.add(candyType[i]);
        }
        if(candyType.length / 2 >= hs.size()){
            return hs.size();
        }
        return candyType.length / 2;
    }
}