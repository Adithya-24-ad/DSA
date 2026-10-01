class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ins_pos = 0
        for i in range(len(nums)):
            if nums[i] != 0:
               nums[ins_pos] , nums[i] = nums[i],nums[ins_pos]
               ins_pos += 1 