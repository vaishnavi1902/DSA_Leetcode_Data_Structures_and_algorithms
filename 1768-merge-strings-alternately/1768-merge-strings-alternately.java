class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = new String("");
        int l = 0 , m = 0 ;
        if(word1.length() > word2.length()){
            l = word1.length();
            m = word2.length();
            for(int i = 0 ; i < l ; i++){
                ans += word1.charAt(i);
                if(i < m) ans += word2.charAt(i); 
            }
        }
        else{
            l = word2.length();
            m = word1.length();
            for(int i = 0 ; i < l ; i++){
                if(i < m) ans += word1.charAt(i); 
                ans += word2.charAt(i);
            }
        }
        return ans;
    }
}