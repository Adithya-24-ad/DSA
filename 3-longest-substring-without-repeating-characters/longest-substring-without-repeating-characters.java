class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0;right < s.length();right++){
            char curr = s.charAt(right);
            while(seen.contains(curr)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(curr);
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}