class Solution {
    public int countCommas(int n) {
        if (999>=n){
            return 0;
        }else {
            return n-999;
        }
    }
}