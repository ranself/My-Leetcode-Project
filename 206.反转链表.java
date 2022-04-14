/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int index;
    ListNode next;

    ListNode(int index, ListNode next) {
        this.index = index;
        this.next = next;
    }
}

class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode ans = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = ans;
            ans = curr;
            curr = next;
        }
        return ans;
    }

}
// @lc code=end
