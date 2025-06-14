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
    public ListNode reverseBetween(ListNode head, int left, int right) {
               if(head==null||head.next==null||left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        for(int i=1;i<left;i++){
            first=first.next;
        }
        ListNode last=first.next;
        for(int i=left;i<=right;i++){
          last=  last.next;
        }
        ListNode rev=null;
        ListNode tem=first.next;
        ListNode h=first.next;
        while(tem!=null&&tem!=last){
            ListNode t=tem;
            tem=tem.next;
            t.next=rev;
            rev=t;
        }
        first.next=rev;
        h.next=last;
        return dummy.next;

    }
}