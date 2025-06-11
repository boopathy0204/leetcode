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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode rev=head;
        head=head.next;
        rev.next = null; 
        while(head!=null){
            ListNode tem=head;
            head= head.next;
            tem.next=rev;
            rev=tem;
        }
        return rev;
    }
}