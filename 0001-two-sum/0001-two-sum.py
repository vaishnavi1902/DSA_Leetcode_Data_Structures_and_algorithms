class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num = len(nums)
        for i in range(num-1):
            for j in range(i+1,num):
                if (nums[i]+nums[j] == target):
                    return [i,j]
        