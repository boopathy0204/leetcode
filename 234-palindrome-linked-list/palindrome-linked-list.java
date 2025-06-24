/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode rev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode newNode = new ListNode(temp.val); 
            newNode.next = rev;
            rev = newNode;
            temp = temp.next;
        }
        while (rev != null && head != null) {
            if (rev.val != head.val) {
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
}
