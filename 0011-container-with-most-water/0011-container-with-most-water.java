class Solution {
    public int maxArea(int[] height) {
        int max = 0 ; 
        int left = 0 ;
        int right = height.length - 1 ;
        while(left < right){
            int sum = Math.min(height[right] , height[left]) * (right - left) ;
            max = Math.max(max , sum);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
} 
