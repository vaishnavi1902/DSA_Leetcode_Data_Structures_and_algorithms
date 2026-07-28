class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n = len(nums)
        arr = [] * n
        for i in nums:
            if(i == val):
                continue
            else:
                arr.append(i)
        nums[:] = arr    # modify original list in-place

        return len(arr)
