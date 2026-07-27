class Solution {
    public int findComplement(int num) {
        if(num == 1){
            return 0;
        }
        else if(num == 0){
            return 1;
        }
        int ans = 0, c = 0;
        while(num > 0){
            int b = num % 2;
            if(b == 1){
                b = 0;
            }
            else{
                b = 1;
            }
            ans += (Math.pow(2, c) * b);
            c++;
            num = num / 2;
        }
        return ans;
    }
}