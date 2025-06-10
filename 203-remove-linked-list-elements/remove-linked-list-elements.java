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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head.val==val){
            head=head.next;
            if(head == null) return head;
        }
        ListNode tem=head;
        while(tem.next!=null){
            if(tem.next.val == val) tem.next = tem.next.next;
            else tem = tem.next;
        }
        return head;
    }
}