class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[n];
        for(int i = 0;i < n;i++){
            int newindex = (i + k )% n;
            temp[newindex] = nums[i];
        }
        for(int i = 0;i < n;i++){
            nums[i] = temp[i];
        }
    }
}