class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            int num = nums[i];
            int dsum = 0;
            while (num > 0) {
                dsum += num % 10;
                num /= 10;
            }
            if(dsum == i) return i;
        }
        return -1;
    }
}