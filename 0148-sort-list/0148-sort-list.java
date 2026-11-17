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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode first=head;
        ListNode s=head;
        ListNode  f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode second=s.next;
        s.next=null;
        first=sortList(first);
        second=sortList(second);
        ListNode ans=merge(first,second);
        return ans;

        
        
    }
    public ListNode merge(ListNode f,ListNode s){
        ListNode dummy =new ListNode(100);
        ListNode t=dummy;
        ListNode t1=f;
        ListNode t2=s;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                t.next=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1==null){
            t.next=t2;
        }else{
            t.next=t1;
        }
        return dummy.next;
    }
}