/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = count > maxCount ? count : maxCount;
                count = 0;
            }
        }
        maxCount = count > maxCount ? count : maxCount;
        return maxCount;
    }
}
// @lc code=end
