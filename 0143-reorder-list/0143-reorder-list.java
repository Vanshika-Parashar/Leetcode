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
    public void reorderList(ListNode head) {
        ListNode leftMiddle=middle(head);
        //sec half
        ListNode head2=leftMiddle.next;
        leftMiddle.next=null;
        head2=reverse(head2);
        ListNode dummy =new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null && head2!=null){
            temp.next=head;
            temp=temp.next;
            head=head.next;
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }
        if(head==null)temp.next=head2;
        if(head2==null)temp.next=head;
        head=dummy.next;
        


    }
    public ListNode middle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
       
    }
    public ListNode reverse(ListNode head){
        ListNode p=null;
        ListNode c=head;
        ListNode n=head;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
}