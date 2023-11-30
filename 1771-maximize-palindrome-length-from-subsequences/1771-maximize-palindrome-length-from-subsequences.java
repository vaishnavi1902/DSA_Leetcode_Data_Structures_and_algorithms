class Solution {
    public int longestPalindrome(String word1, String word2) {
        String s = word1 + word2;
        int res = 0;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1 ; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) { 
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                    if (i < word1.length() && j >= word1.length())
                        res = Math.max(dp[i][j], res);
                }
                else 
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return res;
    }
}