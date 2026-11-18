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
       if(head.next==null)return true;
       ListNode dummy=new ListNode(100);
       ListNode  newH=dummy;
       ListNode temp=head;
      
       //copy to another list
       while(temp!=null){
        newH.next=new ListNode(temp.val);
        temp=temp.next;
        newH=newH.next;
       }
       //REVERSE THE COPIED LIST
        ListNode n=dummy.next;
       ListNode p=null;
       ListNode c=n;
       ListNode ne=c;
       while(c!=null){
        ne=c.next;
        c.next=p;
        p=c;
        c=ne;
       }
       n=p;
        //compare
        temp=head;
        while(temp!=null){
            if(temp.val!=n.val)return false;
            temp=temp.next;
            n=n.next;
        }
       return true;
    }
}