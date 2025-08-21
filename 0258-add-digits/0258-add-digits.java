class Solution {
        static int function(int n){
            int sum = 0;
            while(n > 0){
                sum += (n % 10);
                n = n / 10;
            }
            System.out.println(sum);
            if(sum < 10){
                return sum;
            }
            return function(sum);
        }
    public int addDigits(int num) {
        return function(num);
    }
}