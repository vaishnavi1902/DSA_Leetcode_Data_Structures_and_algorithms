class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int f = fib(n-1);
        int l = fib(n-2);
        return f + l ;
    }
}