class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        a = min(nums)
        b = max(nums)
        ab = []
        for i in range (a,b):
            if i not in nums:
                ab.append(i)
        return ab