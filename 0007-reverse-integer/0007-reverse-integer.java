class Solution {
    public int reverse(int c) {
        long ans = 0 ;
        Long x = Long.valueOf(c);
        boolean negative = false ;
        if(x < 0){
            x = Math.abs(x);
            negative = true ;
        }
        int n = Long.toString(x).length();
        for(int i = n-1 ; i >= 0 ; i-- ){
            ans = ( ans * 10 ) + ( x % 10 );
            x = x / 10;
        }
        if(negative == true)  ans = ans * -1 ;
        int lg = (int)(ans);
        if( (ans > Integer.MAX_VALUE) || (ans < Integer.MIN_VALUE) )
            return 0 ;
        return lg ;
    }
}