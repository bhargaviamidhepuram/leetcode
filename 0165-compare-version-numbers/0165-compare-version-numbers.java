class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int len = Math.max(version1.length(), version2.length());
        for(int i = 0; i < len; i++){
            int num1 = i < a.length ? Integer.parseInt(a[i]) : 0;
            int num2 = i < b.length ? Integer.parseInt(b[i]) : 0;
            if(num1 < num2){
                return -1;
            }
            if(num1 > num2){
                return 1;
            }
        }
        return 0;
    }
}