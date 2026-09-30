class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        prefix = strs[0]
        for i in range(1,len(strs)):
            while not strs[i].lower().startswith(prefix):
                prefix = prefix[0:len(prefix)-1]
        return prefix