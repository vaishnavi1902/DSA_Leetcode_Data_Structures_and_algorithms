class Solution {
    public int integerBreak(int n) {
        int x=1;
        int y=1;
        if( (n == 2) || (n == 3) ) return (n - 1) ; 
        while(n > 0){
            if(n % 3 == 0){
                n -= 3;
                y *= 3;
            }
            else{
                n -= 2;
                x *= 2;
            }
        }
        return x * y;
    }
}