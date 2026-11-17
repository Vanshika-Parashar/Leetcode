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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=new ListNode(100);
        ListNode o=head;
        ListNode e=dummy;
        int n=2;
        ListNode temp=head.next;
        while(temp!=null){
            if(n%2!=0){
                o.next=temp;
                o=o.next;
            }else{
                e.next=temp;
                e=e.next;
            }
            temp=temp.next;
            n++;
        }
        e.next=null;
        o.next=dummy.next;
        return head;
    }
}