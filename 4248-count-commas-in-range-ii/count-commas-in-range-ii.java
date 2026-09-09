class Solution {
    public long countCommas(long n) {
        if(n<=999999L && n>=999){
            return n-999L;
        }else if(n>999999L && n<=999999999L){
            return n-999L+n-999999L;
        }else if(n>999999999L && n<=999999999999L){
            return n-999+n-999999L+n-999999999L;
        }else if(n>999999999999L && n<=999999999999999L){
            return n-999L+n-999999L+n-999999999L+n-999999999999L;
        }else if( n== 1000000000000000L){
            return 3998998998999005L;
        }

        return 0;
    }
}