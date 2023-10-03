import java.util.stream.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int count = 1 , max = 0 ;
        if(nums.length == 0 ){
            return 0 ; 
        }
         if(nums.length == 1 ){
            return 1 ; 
        }
        for(int i = 1 ; i < nums.length ; i++){
          if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1] + 1){
                    count++;
                    max = Math.max(max, count);
                }
                else{
                    max = Math.max(max, count);
                    count = 1;
                }
            }
        }
        return Math.max(max,count);
    }
}