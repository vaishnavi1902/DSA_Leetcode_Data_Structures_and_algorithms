class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();

        if (hayLen < needleLen) {
            return -1;
        }
        
        int x = haystack.indexOf(needle);
        return x ;
        // return -1;
    }
}