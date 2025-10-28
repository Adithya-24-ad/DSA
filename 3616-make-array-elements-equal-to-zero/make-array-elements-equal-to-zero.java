class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for(int v : nums) total += v;
        int prefix = 0 , ans = 0;
        for(int num : nums){
            int suffix = total - prefix - num;
            if(num == 0){
                if(prefix == suffix) ans += 2;
                else if(Math.abs(prefix - suffix) == 1) ans += 1;
            }
            prefix += num;
        }
        return ans;
    }
}