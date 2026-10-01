class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = ""
        s = s.lower()
        for ch in s:
            if ch.isalnum():
                cleaned += ch
        return cleaned == cleaned[::-1]
