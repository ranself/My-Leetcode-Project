import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {

    public int hIndex(int[] citations) {
        // Arrays.sort(citations);
        // int h = 0, i = citations.length - 1; 
        // while (i >= 0 && citations[i] > h) {
        //     h++; 
        //     i--;
        // }
        // return h;
        Arrays.sort(citations);
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h) {
                h++;
            }
        }
        return h;
    }

}
// @lc code=end

