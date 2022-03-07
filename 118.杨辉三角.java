import java.util.*;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num = ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j);
                    row.add(num);
                }
            }
            ret.add(row);
        }
        return ret;
    }

}
// @lc code=end
