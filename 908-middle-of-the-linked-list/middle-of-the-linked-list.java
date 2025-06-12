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
    public ListNode middleNode(ListNode head) {
        
        ListNode l2=head;
        ListNode l1=head;
        while(l1!=null&&l1.next !=null){
            l2=l2.next;
            l1=l1.next.next;
        }
        head=l2;
        return head;
    }
}