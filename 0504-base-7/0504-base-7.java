class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        int sign = 1;
        if(num < 0){
            sign = -1;
        }
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 7;
            sb.append(rem);
            n = n / 7;
        }
        if(sign == -1){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}