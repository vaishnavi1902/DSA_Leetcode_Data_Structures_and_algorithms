class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0 , rs = 0 ;
        int ans[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ls+=nums[i];
            for(int j = i ; j < nums.length ; j++){
                rs+=nums[j];
            }
            ans[i] = Math.abs(rs - ls);
            rs = 0 ;
        }
        return ans;
    }
}