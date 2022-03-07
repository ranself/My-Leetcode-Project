import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int ans2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(ans1, ans2);
    }
}
// @lc code=end
