class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) {
            return 2147483647; 
        }
        float a = (float) dividend ;
        float b = (float) divisor ;
        int c = dividend / divisor ;
        return c ;
    }
}