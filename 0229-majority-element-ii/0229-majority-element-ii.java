class Solution {
    public List<Integer> majorityElement(int[] nums) {
        float limit = ( nums.length / 3 ) ;
        List<Integer> list = new ArrayList<Integer>(); 
        int count = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++){
            for ( int j = i ; j < nums.length ; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > limit){
                list.add(nums[i]);
            }
            count = 0 ;
        }
        Set<Integer> set = new HashSet<>(list);
        set.addAll(list);
        List<Integer> list1 = new ArrayList<>(set);
        return list1 ; 
    }
}