class Solution {
    public String largestOddNumber(String s) {
        int n = s.length();

        for(int i= n-1; i >= 0; i--){
            int a = s.charAt(i) - 48; //ascii
            if( a % 2 != 0 ){
                return s.substring(0 , i + 1) ;
            }
        }
        return "";
    }
}