class Solution {
    public String reverseWords(String s) {
        return reverse(s);
    }
    public static String reverse(String ans) {
    int x = ans.indexOf(" ");
    if(x == -1) return ans;
    return (reverse(ans.substring(x+1)) +" "+ans.substring(0, x)).trim();
    }
}