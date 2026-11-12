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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode a=head;
        ListNode b=head;
        while(b!=null){
            while(b!=null && a.val==b.val){
            b=b.next;
        }
        
            a.next=b;
            a=b;
        }
           
        
        return head;
    }
}