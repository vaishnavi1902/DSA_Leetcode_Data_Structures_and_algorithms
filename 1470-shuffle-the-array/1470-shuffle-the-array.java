class Solution {
    public int[] shuffle(int[] nums, int n) {
        nums[0] *= -1;

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int currentNumber = nums[i];
            while (nums[j] > 0) {
                int target;
                if (j < n) {
                    target = j * 2;
                } else {
                    target = (j - n) * 2 + 1;
                }
                var temp = nums[target];
                nums[target] = currentNumber;
                currentNumber = temp;
                nums[j] *= -1;
                j = target;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return nums;
    }
}