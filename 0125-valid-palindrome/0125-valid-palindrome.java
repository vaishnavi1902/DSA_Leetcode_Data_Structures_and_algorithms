class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char cf = s.charAt(start);
        	char cl = s.charAt(last);
        	if (!Character.isLetterOrDigit(cf )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(cl)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(cf) != Character.toLowerCase(cl)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}