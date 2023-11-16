class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0 , temp = 0 , ans = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            temp = length ; 
            if(s.charAt(i) == ' '){
                length = 0 ;
            }
            else 
            {
                length++;
                temp = length;
                ans = temp ;
            }
        }
        return ans ;
    }
}
