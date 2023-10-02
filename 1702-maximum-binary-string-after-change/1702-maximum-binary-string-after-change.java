class Solution {
    public String maximumBinaryString(String binary) {
        if (binary.length() == 0 || binary.length() == 1) return binary;

        char[] result = binary.toCharArray();

        int left = 0, right = 1;
        while (right < result.length) {
            if (result[left] == '0' && result[right] == '0') {
                result[left] = '1';
                // right becomes '1'
                result[right] = '1';
                // .. but '00' is a special case so we first change it to '11' and then to '10' when right == left + 1
                result[left + 1] = '0';
                left = left + 1;
                right = right + 1;
            } else if (result[left] == '1') {
                left++;
                right = left + 1;
            } else {
                right++;
            }
        }
        
        return String.valueOf(result);
    }
}