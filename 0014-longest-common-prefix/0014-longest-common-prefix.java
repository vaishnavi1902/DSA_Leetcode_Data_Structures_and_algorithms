class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int id = 0 ;
        String newstr = "";
        while( id < s1.length() && id < s2.length()){
            if(s1.charAt(id) == s2.charAt(id)){
                newstr += s1.charAt(id);
                id++;
            }else{
                break;
            }
        }
        return newstr;
    }
}