import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=32 lang=java
 *
 * [32] 最长有效括号
 */

// @lc code=start
class Solution {

    public int longestValidParentheses(String s) {
        var n = s.length();
        var maxans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (var i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
// @lc code=end
