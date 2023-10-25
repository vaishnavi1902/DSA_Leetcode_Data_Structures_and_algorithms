class Solution {
    public boolean isPalindrome(int x) {
// firstly reverse the number and then check if reversed number is same with the actual number
     int reverse = 0;
     int y = x ;
     while(y > 0){
        int t = y % 10 ; 
        reverse = reverse * 10 + t ;
        y = y / 10 ;
     }
     if(reverse == x ){
         return true;
     }
     return false;
    }
}