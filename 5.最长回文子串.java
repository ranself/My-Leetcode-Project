/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    /**
     * 暴力法
     */
    public String longestPalindrome(String s) {
        var n = s.length();
        if (n < 2) {
            return s;
        }
        int maxLen = 1; // 回文的长度
        int begin = 0; // 回文开始点
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j - i + 1 > maxLen && judge(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * 判断是否为回文串
     */
    public Boolean judge(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
// @lc code=end
