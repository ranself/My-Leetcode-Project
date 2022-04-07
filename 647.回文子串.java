/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {

    public int countSubstrings(String s) {
        var n = s.length();
        var maxLen = 1; // 回文的长度
        var begin = 0; // 回文开始点
        var ans = n;
        char[] charArray = s.toCharArray();
        for (var i = 0; i < n - 1; i++) {
            for (var j = i + 1; j < n; j++) {
                if (judge(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                    ans++;
                }
            }
        }
        return ans;
    }

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
