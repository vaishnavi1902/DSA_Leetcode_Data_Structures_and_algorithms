class Solution {
    public int maxFrequency(int[] nums, int k) {
    Arrays.sort(nums);   
    int l=0,r=0;
    long total=0;
    int n = nums.length;
    long ans = 0;
    for( r = 0; r < n ; r++ ){ 
        total = total + nums[r] ;
        while( (nums[r] * (r-l+1)) > (total + k) ){
                total = total- nums[l] ;
                l++; 
            }
            ans = Math.max( ans, r-l+1 ); 
        }
        return (int)ans; 
    }
}